package com.example.storybackend.story;

import com.example.storybackend.exception.RequestException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StoryService implements IStoryService {

    private final StoryRepository storyRepository;

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

    @Override
    public Story updateStory(Story story)
    {
        return null;
    }
}


