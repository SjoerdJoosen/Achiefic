import React, { Component } from "react";
import StoryDataService from "../services/story.service";
import { Link } from "react-router-dom";

export default class StoriesList extends Component {
  constructor(props) {
    super(props);
    this.onChangeSearchTitle = this.onChangeSearchTitle.bind(this);
    this.retrieveStories = this.retrieveStories.bind(this);
    this.refreshList = this.refreshList.bind(this);
    this.setActiveStory = this.setActiveStory.bind(this);
    this.searchTitle = this.searchTitle.bind(this);
    
    this.state = {
      stories: [],
      currentStory: null,
      currentIndex: -1,
      searchTitle: ""
    };
  }

  componentDidMount() {
    this.retrieveStories();
  }

  onChangeSearchTitle(e) {
    const searchTitle = e.target.value;
    this.setState({
      searchTitle: searchTitle
    });
  }

  retrieveStories() {
    StoryDataService.getAll()
      .then(response => {
        this.setState({
          stories: response.data
        });
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }

  refreshList() {
    this.retrieveStories();
    this.setState({
      currentStory: null,
      currentIndex: -1
    });
  }

  setActiveStory(story, index) {
    this.setState({
      currentStory: story,
      currentIndex: index
    });
  }

    removeAllStories() {
    StoryDataService.deleteAll()
      .then(response => {
        console.log(response.data);
        this.refreshList();
      })
      .catch(e => {
        console.log(e);
      });
  }

  searchTitle() {
    this.setState({
        currentStory: null,
        currentIndex: -1
      });

    StoryDataService.findByTitle(this.state.searchTitle)
      .then(response => {
        this.setState({
          stories: response.data
        });
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }

  render() {
    const { searchTitle, stories, currentStory, currentIndex } = this.state;
    
    return (
      <div className="list row">
        <div className="col-md-8">
          <div className="input-group mb-3">
            <input
              type="text"
              className="form-control"
              placeholder="Search by title"
              value={searchTitle}
              onChange={this.onChangeSearchTitle}
            />
            <div className="input-group-append">
              <button
                className="btn btn-outline-secondary"
                type="button"
                onClick={this.searchTitle}
              >
                Search
              </button>
            </div>
          </div>
        </div>
        <div className="col-md-6">
          <h4>Story List</h4>
          
          <ul className="list-group">
            {stories &&
              stories.map((story, index) => (
                <li
                  className={
                    "list-group-item " +
                    (index === currentIndex ? "active" : "")
                  }
                  onClick={() => this.setActiveStory(story, index)}
                  key={index}
                >
                  {story.title}
                </li>
              ))}
          </ul>
          <button
            className="m-3 btn btn-sm btn-danger"
            onClick={this.removeAllStories}
          >
            Remove All
          </button>

        </div>
        <div className="col-md-6">
          {currentStory ? (
            <div>
              <h4>Story</h4>
              <div>
                <label>
                  <strong>Title:</strong>
                </label>{" "}
                {currentStory.title}
              </div>
              <div>
                <label>
                  <strong>Description:</strong>
                </label>{" "}
                {currentStory.description}
              </div>
              <Link
                to={"/stories/" + currentStory.id}
                className="badge badge-warning"
              >
                Edit
              </Link>
            </div>
          ) : (
            <div>
              <br />
              <p>Please select a Story...</p>
            </div>
          )}
        </div>
      </div>
    );
  }
}
