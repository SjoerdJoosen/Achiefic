import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';

export default function StoryForm() {
  const [value, setValue] = React.useState('Controlled');

  const handleChange = (event) => {
    setValue(event.target.value);
  };

  return (
    <Box
      component="form"
      sx={{
        '& .MuiTextField-root': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <div>
        <TextField
          id="outlined-textarea"
          label="Title"
          placeholder="Placeholder"
        />
        <TextField
          id="outlined-textarea"
          label="Author"
          placeholder="Placeholder"
        />
        <TextField
          id="outlined-textarea"
          label="Genre"
          placeholder="Placeholder"
        />
        <TextField
          id="outlined-textarea"
          label="Description"
          placeholder="Placeholder"
        />
        <TextField
          id="outlined-textarea"
          label="Story"
          placeholder="Placeholder"
          multiline
        />

      </div>
    </Box>
  );
}
