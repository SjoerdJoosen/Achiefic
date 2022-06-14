import 'bootstrap/dist/css/bootstrap.min.css'
import { Nav, Navbar, NavDropdown } from 'react-bootstrap'
import '../Components/header.css';

function header() {
  
  return(
  <Navbar bg="dark" variant="dark" 
    sticky="top" expand="sm" collapseOnSelect>
    <Navbar.Brand>
      <img src="./logo.svg" width="50px" height="50px" />
        Achiefic
    </Navbar.Brand>
    <Navbar.Toggle className="coloring" />
      <Navbar.Collapse>
        <Nav>
          <NavDropdown title="Menu">
            <NavDropdown.Item href="/story.component">Story</NavDropdown.Item>
            <NavDropdown.Item href="/add-story.component">Add Story</NavDropdown.Item>
          </NavDropdown>
          <Nav.Link href="#about-us">About Us</Nav.Link>
          <Nav.Link href="#contact-us">Contact Us</Nav.Link>
          <Nav.Link href="/Chatroom">Chatroom</Nav.Link>              
        </Nav>
      </Navbar.Collapse>
    </Navbar>
  )
}

export default header