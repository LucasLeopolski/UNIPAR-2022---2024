//criando uma variavel  referenciando o elemento html
let inputVlrRec = document.querySelector('#inputVlrRec');
let inputVlrProd = document.querySelector('#inputVlrProd');
let btCalcular = document.querySelector('#btCalcular'); 
let h3Troco = document.querySelector('#h3Troco');
let valorProduto;
let valorRecebido;
let subtracao;
/*criando função para ser executado quando clicar no btSalvar*/

function calcularTroco(){
    valorRecebido = Number(inputVlrRec.value);
     valorProduto = Number(inputVlrProd.value);

    subtracao = valorRecebido - valorProduto;
    h3Troco.textContent = Number(subtracao);
}
btCalcular.onclick = function(){
    calcularTroco();
    limpa();

}