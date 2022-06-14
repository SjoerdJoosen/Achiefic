import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import Header from './Components/header';
import {BrowserRouter as Router} from 'react-router-dom';
import { render } from '@testing-library/react';
import { FrontendRoutes } from './routes';

function App() {
  render()
  return (
    <Router>
        <Header />
        <div className="App">
        <FrontendRoutes/>
        </div>
    </Router>
  );
}

export default App