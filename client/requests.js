var username='codeheaven-io';
axios.get('https://api.github.com/users/' + username)
  .then(function(response){
    console.log('Response data: ' + response.data); // ex.: { user: 'Your User'}
    console.log('Response status: ' +response.status); // ex.: 200
    for(property in response){
    	//alert(property);
    }
    if(response.data.hasOwnProperty('id')){
    	alert('d'+response.data.id);
	}
  });  