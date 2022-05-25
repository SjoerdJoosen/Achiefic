package com.example.storybackend.story;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoryViewModel {

    public Long storyId;

    private String title;

    private String author;

    private String genre;

    private String description;

    private Integer wordCount;

    private Integer ageRating;

    private String actualStory;

    public StoryViewModel(Story story) {

    }
}
