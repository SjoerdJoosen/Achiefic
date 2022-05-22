package com.example.storybackend.story;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoryService {

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
