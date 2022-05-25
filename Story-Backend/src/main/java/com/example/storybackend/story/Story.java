package com.example.storybackend.story;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table (name = "story")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Story {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public Long storyId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    private String description;

    @Column(name = "wordCount")
    private Integer wordCount;

    @Column(name = "ageRating")
    private Integer ageRating;

    @Column(name = "actualStory")
    private String actualStory;

}
