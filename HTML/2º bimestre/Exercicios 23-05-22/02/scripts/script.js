let inputPessoas = document.querySelector('#inputPessoas');
let ovos = document.querySelector('#ovos'); 
let queijo = document.querySelector('#queijo');
let btCalcular = document.querySelector('#btCalcular');
let pessoas; 
let calcOvos;
let calcQueijo;

function calcular(){
    pessoas = Number(inputPessoas.value); 
    calcOvos= pessoas*2;
    calcQueijo= pessoas*50;
    ovos.textContent= "Será necessário "+calcOvos+ " ovos e também "+calcQueijo+" gramas de queijo";
}

btCalcular.onclick= function(){
    calcular(); 
}

