let inputNumero= document.querySelector("#inputNumero");
let btAdicionar = document.querySelector("#btAdicionar"); 
let btExibir = document.querySelector("#btExibir");
let pNumeros = document.querySelector("#pNumeros");
let arrayNumeros = [];

function adicionarNumeros(){
   // let numero = Number(inputNumero.value);
   // arrayNumeros.push(numero);

   arrayNumeros.push(Number(inputNumero.value));
   inputNumero.value = '';
}

function exibirNumeros(){
    let numeros = '';
    for(let i = 0; i< arrayNumeros.length; i++){
        numeros = numeros + arrayNumeros[i] + '<br>';
        pNumeros.innerHTML = numeros;
    }
}
btAdicionar.onclick = function(){
    adicionarNumeros();
}
btExibir.onclick = function(){
    exibirNumeros();
}