let inputProduto = document.querySelector("#inputProduto");
let resultado = document.querySelector("#resultado");
let botao = document.querySelector("#botao");
let prod;

function produto(){
    prod = Number(inputProduto.value);
    if (prod===001) {
        resultado.textContent= "Sua escolha foi Parafuso!"

     } else if(prod===002){
        resultado.textContent= "Sua escolha foi Porca!"        
        
    }else if (prod===003){
         resultado.textContent= "Sua escolha foi Prego!"
        
    } else {
        resultado.textContent= "Diversos"
        
    }
}

botao.onclick=function(){
    produto();
}