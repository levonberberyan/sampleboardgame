var para = document.createElement("p");
var node = document.createTextNode("This is new.");
para.appendChild(node);

var div = document.getElementById("el");
div.appendChild(para);

var a = document.createElement("a");
var atext=document.createTextNode("This is a dog");
a.appendChild(atext);
div.appendChild(a);

function createElement(tag,text,domelement){
	var element = document.createElement(tag);
	var elementText= document.createTextNode(text);
	element.appendChild(elementText);
    domelement.appendChild(element);
}
createElement("h1","Ani",div);
createElement("p","Anna",div);

for(var i=0;i<3;i++){
	createElement("h1","This is a pen",div);
}
