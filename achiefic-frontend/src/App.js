import React, { Component } from "react";
import { Switch, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import AddStory from "./components/add-story.component";
import Story from "./components/story.component";
import StoryList from "./components/stories-list.component";

class App extends Component {
  render() {
    return (
      <div>
        <nav className="navbar navbar-expand navbar-dark bg-dark">
        <Link to={"/stories"} className="navbar-brand">
            Achiefic
          </Link>
          <div className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link to={"/stories"} className="nav-link">
                Stories
              </Link>
            </li>
            <li className="nav-item">
              <Link to={"/add"} className="nav-link">
                Add story
              </Link>
            </li>
          </div>
        </nav>
        <div className="container mt-3">
          <Switch>
            <Route exact path={["/", "/stories"]} component={StoryList} />
            <Route exact path="/add" component={AddStory} />
            <Route path="/stories/:id" component={Story} />
          </Switch>
        </div>
      </div>
    );
  }
}
export default App;