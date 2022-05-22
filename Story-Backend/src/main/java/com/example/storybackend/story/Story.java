package com.example.storybackend.story;

public class Story {

    private Long storyId;
    private String title;
    private String author;
    private String genre;
    private String description;
    private Integer wordCount;
    private Integer ageRating;
    private String actualStory;

    public Story() {
    }

    public Story(Long storyId, String actualStory) {
        this.storyId = storyId;
        this.actualStory = actualStory;
    }

    public Story(Long storyId, String title, String author, String genre, String description, Integer wordCount, Integer ageRating, String actualStory) {
        this.storyId = storyId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.wordCount = wordCount;
        this.ageRating = ageRating;
        this.actualStory = actualStory;
    }

    public Story(String title, String author, String genre, String description, Integer wordCount, Integer ageRating, String actualStory) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.wordCount = wordCount;
        this.ageRating = ageRating;
        this.actualStory = actualStory;
    }

    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(Integer ageRating) {
        this.ageRating = ageRating;
    }

    public String getActualStory() {
        return actualStory;
    }

    public void setActualStory(String actualStory) {
        this.actualStory = actualStory;
    }

    @Override
    public String toString() {
        return "Story{" +
                "storyId=" + storyId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", wordCount=" + wordCount +
                ", ageRating=" + ageRating +
                ", actualStory='" + actualStory + '\'' +
                '}';
    }
}
