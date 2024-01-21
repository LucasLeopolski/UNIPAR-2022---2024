let inputSabor=document.querySelector("#inputSabor");
let inputRefri=document.querySelector("#inputRefri");
let fimPedi=document.querySelector("#fimPedi");
let calc = document.querySelector("#calc");
let sabor1;
let calcRefri;


function sabores(){
     sabor1=String(inputSabor.value);
     refrigerante=Number(inputRefri.value);
     calcRefri= (refrigerante*7) +57;
     calc.textContent = "O seu pedido foi: "+sabor1+ " e também: "+refrigerante+" refrigerantes, totalizando: "+calcRefri+" R$"
}
fimPedi.onclick = function(){
    sabores();
}