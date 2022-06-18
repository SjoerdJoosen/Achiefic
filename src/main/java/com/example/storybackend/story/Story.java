package com.example.storybackend.story;

import javax.persistence.*;

@Entity
@Table(name = "stories")
public class Story {

    @Id
    @GeneratedValue
    public int storyId;
    private String title;
    private String author;
    private String genre;
    private String description;
    private String actualStory;
    public Story() {

    }

    public Story(int storyId, String title, String author, String genre, String description, String actualStory) {
        this.storyId = storyId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.actualStory = actualStory;
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

    public String getActualStory() {
        return actualStory;
    }
}
