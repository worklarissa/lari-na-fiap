function move() {
    var elemento = document.getElementById(animate);
    var pos=0;

    var repeticao = setInterval(quadro,5)
     
    function quadro(){
        if(pos==850){

        }
        else{
            pos++;
            elemento.style.top =pos + "px";
            elemento.style.top =pos + "px";

        }
    }

}