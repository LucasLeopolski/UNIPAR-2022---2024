let inputNumero=document.querySelector("#inputNumero");
let btInserir=document.querySelector("#btInserir");
let btExibir=document.querySelector("#btExibir");
let pNumeros=document.querySelector("#pNumeros");
let arrayNumeros =[];

function InserirNum(){
    arrayNumeros.push(Number(inputNumero.value));
    inputNumero.value= '';
}

function ExibirNum(){
    let numeros='';
    for(let i=0; i<=9; i++){
        numeros= numeros+arrayNumeros[i]+'<br>';
        pNumeros.innerHTML = numeros;
    }
}
btInserir.onclick=function(){
    InserirNum();
}
btExibir.onclick=function(){
    ExibirNum();
}