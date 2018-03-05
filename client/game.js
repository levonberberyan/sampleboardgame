
function openCell(value,id){
	var response=moveRequest(1,1);
	if (response.value=='G'){
		changeimage(id,"gold.jpg")
	}
	else if(){
		
	}
	document.getElementById(id).innerHTML=value;
	
}

function changeimage(id,source){
  var image=document.getElementById(id);
  image.src=source;

}