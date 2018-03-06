
function openCell(id){
	moveRequest(id);
	var image=document.getElementById(id);
	if (elementValue=='G'){
		image.src="gold.jpg";
	}else if( elementValue=='B'){
		image.src="bomb.jpg";
	}else if(elementValue=='E'){
		image.src="empty.jpg";
	}
	var gameStatusElement= document.getElementById('gameStatus');
	gameStatusElement.innerHTML=gameStatus;
	var lifeNumberElement= document.getElementById('lifeNumber');
	lifeNumberElement.innerHTML=lifeNumber;
	var goldNumberElement= document.getElementById('goldNumber');
	goldNumberElement.innerHTML=goldNumber;
}

function changeimage(id,source){
  var image=document.getElementById(id);
  image.src=source;

}
var coordinateX =0; 
var coordinateY =1;
var elementValue='E';
var gameStatus='In progress';
var lifeNumber=5;
var goldNumber=2;
function moveRequest(id){
  /*axios.get('localhost:8080/goldminerthegame/move?x=' + x + '&y=' + y)
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
    var response=moveRequest(1,1);
	if (response.value=='G'){
		changeimage(id,"gold.jpg")
	}
	else if(){
		
	}
    */
}
