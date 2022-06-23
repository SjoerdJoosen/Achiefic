package com.example.storybackend.story;

import com.example.storybackend.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping("/stories")
    public List<Story> getAllStories()
    {
        try
        {
            return storyService.getAllStories();
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot find stories");
        }

    }

    @PostMapping("/story")
    public Story addStory(@RequestBody Story story)
    {
        try
        {
            return storyService.addStory(story);
        }

        catch (Exception exception)
        {
            throw new RequestException("Unable able to add story");
        }
    }
/*@PostMapping("/stories")
public ResponseEntity<Story> addStory(@RequestBody Story story) {
    try {
        Story _story = storyService.addStory(new Story(story.getTitle(), story.getAuthor(), story.getGenre(),
                story.getDescription(), story.getActualStory()));
        return new ResponseEntity<>(_story, HttpStatus.CREATED);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}*/

    @GetMapping(value = "/stories/{id}")
    public Story getStoryById(@PathVariable int id)
    {
        try
        {
            return storyService.getStoryById(id);
        }
        catch (Exception exception)
        {
            throw new RequestException("Cannot get story by Id");
        }
    }
    @DeleteMapping(value = "/stories/{id}")
    public String deleteStory(@PathVariable int id)
    {
        try
        {
            return storyService.deleteStory(id);
        }
        catch (Exception exception)
        {
            throw new RequestException("Cannot delete story");
        }
    }
}