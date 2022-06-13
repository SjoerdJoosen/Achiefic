package com.example.storybackend.story;

import com.example.storybackend.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/stories")
@CrossOrigin
@RestController
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping()
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

    @PostMapping()
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

    @GetMapping(value = "{id}")
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
    @DeleteMapping(value = "{id}")
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