function performGetRequest1() {
  //var resultElement = document.getElementById('getResult1');
 // resultElement.innerHTML = '';
  
  axios.get('http://jsonplaceholder.typicode.com/todos')
    .then(function (response) {
      //resultElement.innerHTML = generateSuccessHTMLOutput(response);
      alert(generateSuccessHTMLOutput(response));

      
    })
    .catch(function (error) {
      //resultElement.innerHTML = generateErrorHTMLOutput(error);
      alert(generateSuccessHTMLOutput(error));
    });   
}
//performGetRequest1();

function getRequest(){
	// Make a request for a user with a given ID
axios.get('http://jsonplaceholder.typicode.com/todos')
  .then(function (response) {
    alert(response);//console.log(response);
  })
  .catch(function (error) {
    alert(error);//console.log(error);
  });
}
//getRequest();

function myfunction(k1,k2){
	alert(k1 + k2);
}
//myfunction(10,5);
function myfunction2(k1,k2){
	alert(k1 * k2);
}
myfunction2(10,5);
function myfunction3(k1,k2){
	var power=1;
	for(var i=0; i<k2;i=i+1)
	{
		power=power*k1;
	}
	alert(power);
}
myfunction3(2,3);
function changeContent(value,id){
	document.getElementById(id).innerHTML=value;
	
}
