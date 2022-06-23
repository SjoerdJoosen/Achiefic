package com.example.storybackend.profile;

import com.example.storybackend.story.Story;
import lombok.*;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ProfileId;
    private String userName;
    private String profileDescription;
    private int age;
    private int publishedStories;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Story> stories;
}
