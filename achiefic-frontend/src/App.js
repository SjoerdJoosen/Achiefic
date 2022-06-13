import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import React, { Component } from "react";
import {BrowserRouter as Router} from 'react-router-dom';
import { Link } from 'react-router-dom';
import { FrontendRoutes } from './routes';

class App extends Component {
  render() {
    return (
      <Router>
        <div className="App">
          <FrontendRoutes/>
        </div>
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
      </div>
      </Router>
    );
  }
}
export default App;