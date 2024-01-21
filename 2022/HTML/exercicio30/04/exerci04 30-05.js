let inputNome=document.querySelector("#inputNome");
let btExibir=document.querySelector("#btExibir");
let btIserir=document.querySelector("#btIserir");
let calculo=document.querySelector("#calculo");
let array= [10]

function inserirNome(){
array.push(String(inputNome.value));
inputNome.value='';
}
function exibirNome(){
    let nomes='';
    for(let i=0; i<10; i++){
        nomes = nomes+array[i]+'<br>';
        calculo.innerHTML=nomes;
    }
}
btExibir.onclick = function(){
    exibirNome();
}


btIserir.onclick = function(){
    inserirNome();
}