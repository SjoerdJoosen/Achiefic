package com.example.storybackend.story;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/story")
public class StoryController {

    private StoryService storyService;

    @GetMapping
    public List<Story> getAllStories() {

        return List.of(
                new Story(
                        1L,
                        "LotsOfWork",
                        "Me",
                        "Horror",
                        "SoMuchToDoAndSee",
                        250,
                        18,
                        "ah"
                ));
        }
    }
