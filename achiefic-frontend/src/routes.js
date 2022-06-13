import { Route, Routes } from 'react-router-dom';
import './App.css';
import AddStory from "./Components/add-story.component";
import Story from "./Components/story.component";
import StoryList from "./Components/stories-list.component";

export const FrontendRoutes  = () => {
    return (
        <div className="container mt-3">
        <Routes>
          <Route exact path='/' element={<StoryList/>} />
          <Route exact path='/add' element={<AddStory/>} />
          <Route exact path='/stories:id' element={<Story/>} />
        </Routes>
      </div>
    );  
};