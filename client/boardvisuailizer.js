function createCell(parent){
	var div = document.createElement("div");
	var image = document.createElement("img");

	div.appendChild(image);
	div.class = "col-md-2 buttonstyle text-center";
	image.width ="30px";
	image.height="30px";
	image.src="bomb.jpg";
	image.onclick="changeimage(1)";
	image.id="1";

	parent.appendChild(div);
}
var d1 = document.getElementById("parent1");
createCell(d1);