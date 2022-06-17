package com.example.storybackend.story;

import com.example.storybackend.story.Story;
import com.example.storybackend.story.StoryRepository;
import com.example.storybackend.story.IStoryService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class StoryControllerUnitTest {

   /* @Mock
    private StoryRepository repository;
    private StoryService service;

    @BeforeEach
    void setUp() {
        service = new StoryService(repository);
    }
    @Test
    void getAllStories() {

        service.getAllStories();
        verify(repository).findAll();
    }

    @Test
    void addStory() {

        Story expected = new Story(1, "First Book", "The Creator", "Adventure", "very long novel", "a novel that is too long to fit the page");
        service.addStory(expected);

        ArgumentCaptor<Story> dishArgumentCaptor =
                ArgumentCaptor.forClass(Story.class);
        verify(repository)
                .save(dishArgumentCaptor.capture());

        Story actual = dishArgumentCaptor.getValue();

        assertThat(expected).isEqualTo(actual);
        System.out.println(expected.getTitle());
        System.out.println(expected.getAuthor());
        System.out.println(expected.getGenre());
        System.out.println(expected.getDescription());
        System.out.println(expected.getActualStory());
    }

    @Test
    void deleteStory() {
        int id = 1;

        given(repository.existsById(id)).willReturn(true);
        service.deleteStory(id);
        verify(repository).deleteById(id);
        System.out.println(repository.count());

    }*/
}