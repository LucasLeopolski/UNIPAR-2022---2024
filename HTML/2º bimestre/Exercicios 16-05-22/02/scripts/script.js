//criando uma variavel  referenciando o elemento html
let inputKG = document.querySelector('#inputKG');
let inputPreco = document.querySelector('#inputPreco');
let btCalcular = document.querySelector('#btCalcular');
let inputResul = document.querySelector('#inputResul');


/*criando função para ser executado quando clicar no btSalvar*/

function calcularPreco(){
    //let inputKG = Number(inputKG.value);
    //document.getElementById('#resultado').innerHTML = inputKG * inputPreco;
    let inputResul = String(inputKG.value*inputPreco.value);

}
btCalcular.onclick = function(){
    calcularPreco();
    limparCampos();
}