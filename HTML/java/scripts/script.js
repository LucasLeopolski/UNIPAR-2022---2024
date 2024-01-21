let titulo = document.querySelector('#titulo');
let campoTexto = document.querySelector('#campoTexto');
let botao = document.querySelector('#botao');

function alteraTitulo(){
    let texto = String (campoTexto.value);
    titulo.textContent = texto;
}

botao.onclick = function (){
    alteraTitulo();
}