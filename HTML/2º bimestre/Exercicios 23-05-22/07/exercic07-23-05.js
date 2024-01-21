let inputPrimNum=document.querySelector("#inputPrimNum");
let inputSegNum=document.querySelector("#inputSegNum");
let btCalc=document.querySelector("#btCalc");
let =document.querySelector("#operacao");
let num1; 
let num2;

function calcular(){
    num1=Number(inputPrimNum.value);
    num2=Number(inputSegNum.value);

    if (num1>num2) {
        operacao.textContent="O primeiro número é maior que o segundo número"
    } else if (num1<num2){
        operacao.textContent="O primeiro número é menor que o segundo número"
        
    }else{
        operacao.textContent="O primeiro número é igual ao segundo número"
    }
}

btCalc.onclick=function(){
    calcular();
}


        