package com.example.storybackend.story;

import java.util.List;

public interface IStoryService {

    List<Story> getAllStories();
    Story addStory(Story story);
    Story getStoryById (int id);
    String deleteStory (int id);
    Story updateStory(Story story);
}
