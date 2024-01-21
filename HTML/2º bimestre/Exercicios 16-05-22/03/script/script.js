let input1Num= document.querySelector('#input1Num');
let input2Num= document.querySelector('#input2Num');
let btCalcular = document.querySelector('#btCalcular');
let h2Result = document.querySelector('#h2Result');
let num1;
let num2;

//criar a função que será executada quando clicar no botão

function calcular(){
    num1=Number(input1Num.value);
    num2=Number(input2Num.value);
    if (num1 > num2){ 
    h2Result.textContent=num1;
    }else{
        h2Result.textContent=num2;
    }

}
btCalcular.onclick = function(){
    calcular();
}