import * as React from 'react';
import TextField from '@mui/material/TextField';
import { Container } from '@mui/system';
import { Paper } from '@mui/material';

export default function StoryForm() {
  const [value, setValue] = React.useState('Controlled');
  
  const paperStyle = {padding: '50px 20px', width:600,margin:"20px auto"}
  const handleChange = (event) => {
    setValue(event.target.value);
  
  };

  return (

      <Container>
          <Paper elevation = {3} style = {paperStyle}>
        
        <form noValidate autoComplete= "off">

          <TextField id="outlined-textarea" label="Title" variant="outlined" fullWidth/>
          <TextField id="outlined-textarea" label="Author"variant="outlined" fullWidth/>
          <TextField id="outlined-textarea" label="Genre"variant="outlined" fullWidth/>
          <TextField id="outlined-textarea" label="Description"variant="outlined" fullWidth/>
          <TextField id="outlined-textarea" label="Story" multiline variant="outlined" fullWidth/>

        </form>
        </Paper>
      </Container>
  );
}
