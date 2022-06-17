package com.example.storybackend.story;

import com.example.storybackend.story.StoryController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.storybackend.story.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(StoryController.class)
public class StoryControllerIntegrationTest {

   /* @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StoryService service;

    @Test
    public void getAllStories() throws Exception {
        List<Story> stories = new ArrayList<>();

        Story story1 = new Story(1, "First Book", "The Creator", "Adventure", "very long novel", "a novel that is too long to fit the page");
        Story story2 = new Story(2, "Second Book", "The Created", "Adventure", "also long novel", "a novel that is also too long to fit the page");
        stories.add(story1);
        stories.add(story2);

        Mockito.when(service.getAllStories())
                .thenReturn(stories);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/api/stories"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].storyId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].title").value("First Book"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].author").value("The Creator"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].genre").value("Adventure"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].description").value("very long novel"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].actualStory").value("a novel that is too long to fit the page"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].storyId").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].title").value("Second Book"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].author").value("The Created"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].genre").value("Adventure"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].description").value("also long novel"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].actualStory").value("a novel that is also too long to fit the page"));
    }
*/
}