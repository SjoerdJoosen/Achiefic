package com.example.storybackend.story;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class StoryControllerUnitTest {

    @Test
    void getAllStories() {
        StoryService storyService = Mockito.mock(StoryService.class);
        StoryController storyController = new StoryController();

    }

    @Test
    void addStory() {
    }

    @Test
    void getStoryById() {
    }

    @Test
    void deleteStory() {
    }
}