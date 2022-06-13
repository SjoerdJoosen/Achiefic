import React, { Component } from "react";
import StoryDataService from "../services/story.service";

export default class AddStory extends Component {
  constructor(props) {
    super(props);
    this.onChangeTitle = this.onChangeTitle.bind(this);
    this.onChangeDescription = this.onChangeDescription.bind(this);
    this.saveStory = this.saveStory.bind(this);
    this.newStory = this.newStory.bind(this);
    this.state = {
      id: null,
      title: "",
      author: "",
      genre: "",
      description: "",
      actualStory: "",
    };
  }
  onChangeTitle(e) {
    this.setState({
      title: e.target.value
    });
  }
  onChangeDescription(e) {
    this.setState({
      description: e.target.value
    });
  }
  saveStory() {
    var data = {
      title: this.state.title,
      author: this.state.author,
      genre: this.state.genre,
      description: this.state.description,
      actualStory: this.state.actualStory
    };
    StoryDataService.create(data)
      .then(response => {
        this.setState({
          id: response.data.id,
          title: response.data.title,
          author: response.data.author,
          genre: response.data.genre,
          description: response.data.description,
          actualStory: response.data.description
        });
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }
  newStory() {
    this.setState({
      id: null,
      title: "",
      author: "",
      genre: "",
      description: "",
      actualStory: "",
    });
  }
  render() {
    // ...
  }
}