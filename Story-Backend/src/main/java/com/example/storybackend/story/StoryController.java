package com.example.storybackend.story;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https;//localhost:3000")
@RestController
@RequestMapping("api/stories")
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping("/stories")
    public List<Story> getAllStories() {

        return storyService.getAllStories();
    }

    @PostMapping("/add")
    public Story addStory(@RequestBody Story story) {
        return storyService.addStory(story);
    }
}