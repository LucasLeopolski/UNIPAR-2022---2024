let inputCotacao = document.querySelector('#inputCotacao');
let botaoCalculo = document.querySelector('#botaoCalculo');
let h3result1PorCento = document.querySelector('#h3result1PorCento');
let h3result2PorCento = document.querySelector('#h3result2PorCento');
let h3result5PorCento = document.querySelector('#h3result5PorCento');
let h3result10PorCento = document.querySelector('#h3result10PorCento');
let dolar;
let calc1;
let calc2;
let calc5;
let calc10;

function calcular1(){
    dolar= Number(inputCotacao.value);
    calc1 = dolar*0.01+dolar;  
    h3result1PorCento.textContent = calc1;
    calc2 = dolar*0.02+dolar; 
    h3result2PorCento.textContent = calc2;
    calc5 = dolar*0.05+dolar; 
    h3result5PorCento.textContent = calc5;
    calc10 = dolar*0.10+dolar;
    h3result10PorCento.textContent = calc10;
}
botaoCalculo.onclick = function(){
    calcular1();
}