package com.example.storybackend.story;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {

/*    List<Story> findByTitle(String Title);
    List<Story> findByGenre(String Genre);*/

}
