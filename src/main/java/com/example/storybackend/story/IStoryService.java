package com.example.storybackend.story;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IStoryService {

    List<Story> getAllStories();
    Story addStory(Story story);
    Story getStoryById (int id);
    String deleteStory (int id);
    ResponseEntity<Story> updateStory(int id, Story story);
}
