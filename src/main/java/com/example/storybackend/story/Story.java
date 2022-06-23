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

    public Story(int StoryId, String title, String author, String genre, String description, String actualStory) {
        this.storyId = StoryId;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActualStory(String actualStory) {
        this.actualStory = actualStory;
    }
}
