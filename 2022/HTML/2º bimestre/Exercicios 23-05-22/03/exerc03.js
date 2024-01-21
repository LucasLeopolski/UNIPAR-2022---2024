let inputNum1 = document.querySelector("#inputNum1");
let inputNum2 = document.querySelector("#inputNum2");
let resul1 = document.querySelector("#resul1");
let resul2 = document.querySelector("#resul2");
let resul3 = document.querySelector("#resul3");
let resul4 = document.querySelector("#resul4");
let btCalc = document.querySelector("#btCalc");
let primNum;
let segNum;
let soma;
let subtracao;
let multiplicacao;
let divisao;

function operacoes(){
    primNum= Number(inputNum1.value);
    segNum= Number(inputNum2.value);

    soma = primNum + segNum
    resul1.textContent="A soma dos números inseridos é: "+soma;

    subtracao = primNum - segNum
    resul2.textContent = "A subtração entre os dois números inseridos é: "+subtracao;

    multiplicacao = primNum * segNum
    resul3.textContent = "A multiplicação entre os dois números inseridos é: "+multiplicacao;

    divisao = primNum / segNum
    resul4.textContent = "A divisão entre os dois números inseridos é: "+divisao;

}

btCalc.onclick = function(){
    operacoes();
}