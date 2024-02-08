function Mover () {
    var elemento = document.getElementById("animate");
    var pos=0;

    var repeticao = setInterval(Quadro,5);
    
        function Quadro(){
            if(pos==850){
                clearInterval(repeticao)
                var repeticaoDois = setInterval(QuadroDois,5)
            }
            else{
                pos++;
                elemento.style.top = pos + "px";
                elemento.style.left = pos + "px";
            }
    
            function QuadroDois(){
            if(pos==850){
                clearInterval(repeticaoDois)
                
            }
            else{
                pos--;
                elemento.style.top = pos + "px";
                elemento.style.left = pos + "px";
            }
    }

}

//Exercício extra
/*var MinhaDiv = document.getElementById("minhaDiv");
minhaDiv.style.display = ()