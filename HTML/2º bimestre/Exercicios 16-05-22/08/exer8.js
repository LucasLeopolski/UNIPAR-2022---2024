let inputSaldo = document.querySelector("#inputSaldo");
let btCalc = document.querySelector("#btCalc");
let result = document.querySelector("#result");
let saldo;
let calcu;


function acrescentar1(){
    saldo = Number(inputSaldo.value);
    calcu = (saldo*0.01)+saldo
    result.textContent="O seu saldo com acrescimo de 1% é de "+calcu+ " R$"


}

btCalc.onclick = function(){
    acrescentar1();
}