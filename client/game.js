
function openCell(id, y, x){
	moveRequest(y, x, id);
}

function changeimage(id,source){
  var image=document.getElementById(id);
  image.src=source;

}
var coordinateX=0; 
var coordinateY=1;
var elementValue='';
var gameStatus='';
var lifeNumber=3;
var goldNumber=0;
function moveRequest(y,x,id){
  axios.get('http://localhost:8080/goldminerthegame/move?x=' + x + '&y=' + y)
    .then(function(response){
      if(response.hasOwnProperty('data')){
        /*for(property in response.data){
          console.log(property)
        }*/
        if(response.data.hasOwnProperty('value')){
          elementValue = response.data.value;
        }
        if(response.data.hasOwnProperty('gold')){
          goldNumber = response.data.gold;
        }
        if(response.data.hasOwnProperty('lives')){
          lifeNumber = response.data.lives;
        }
        if(response.data.hasOwnProperty('status')){
          gameStatus = response.data.status;
        }
      }
      handleResponse(id,y,x);
      //return response;
    }); 
}

function handleResponse(id, y, x){
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
