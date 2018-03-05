function moveRequest(x,y){
  axios.get('localhost:8080/goldminerthegame/move?x=' + x + '&y=' + y)
    .then(function(response){
      console.log('Response gold: ' + response.gold); // ex.: { user: 'Your User'}
      console.log('Response status: ' +response.status); // ex.: 200
      console.log('Response info: ' +response.info);
      console.log('Response value: ' +response.value);
      console.log('Response lives: ' +response.lives);
      for(property in response){
        //alert(property);
      }
      if(response.data.hasOwnProperty('id')){
        alert('d'+response.data.id);
      }
      return response;
    }); 
}
 