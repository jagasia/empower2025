fetch('https://jsonplaceholder.typicode.com/posts/1')
  .then(res => res.json())              // parse JSON body
  .then(data => console.log(data))      // now we have the object
  .catch(err => console.log('Error:', err));
