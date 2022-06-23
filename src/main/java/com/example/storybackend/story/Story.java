package com.example.storybackend.story;

import com.example.storybackend.profile.Profile;
import lombok.*;
import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Data
@AllArgsConstructor
@Table(name = "stories")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "profileId")
    @JsonBackReference
    private Profile profile;
}
