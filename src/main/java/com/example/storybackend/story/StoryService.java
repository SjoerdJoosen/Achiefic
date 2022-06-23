package com.example.storybackend.story;

import com.example.storybackend.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StoryService implements IStoryService {

    @Autowired
    private StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {this.storyRepository = storyRepository;}

    public List<Story> getAllStories()
    {
        try
        {
            return storyRepository.findAll();
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot find stories");
        }
    }

    public Story addStory(Story story)
    {
        try
        {
            return storyRepository.save(story);
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot add story");
        }
    }

    public Story getStoryById (int id)
    {
        try
        {
            return storyRepository.findById(id).orElse(null);
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot get story by Id");
        }
    }

    public String deleteStory(int id)
    {
        try
        {
            storyRepository.deleteById(id);
            return "Story deleted" + id;
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot delete story");
        }
    }
    public ResponseEntity<Story> updateStory(@PathVariable int id, @RequestBody Story Story) {
        Story existingStory = storyRepository.findById(id)
                .orElseThrow(() -> new RequestException("Story does not exist"));

        existingStory.setTitle(Story.getTitle());
        existingStory.setAuthor(Story.getAuthor());
        existingStory.setGenre(Story.getGenre());
        existingStory.setDescription(Story.getDescription());
        existingStory.setActualStory(Story.getActualStory());

        Story updated = storyRepository.save(existingStory);
        return ResponseEntity.ok(updated);
    }
}


