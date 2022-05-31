package com.example.storybackend.story;

import javax.persistence.*;

@Entity
public class Story {

    @Id
    public int storyId;

    private String title;

    private String author;

    private String genre;

    private String description;

    private Integer wordCount;

    private Integer ageRating;

    private String actualStory;

    public Story() {

    }

    public Story(int storyId, String title, String author, String genre, String description, Integer wordCount, Integer ageRating, String actualStory) {
        this.storyId = storyId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.wordCount = wordCount;
        this.ageRating = ageRating;
        this.actualStory = actualStory;
    }

    public int getStoryId() {
        return storyId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public Integer getAgeRating() {
        return ageRating;
    }

    public String getActualStory() {
        return actualStory;
    }
}
