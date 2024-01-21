let inputNum1 = document.querySelector("#inputNum1");
let inputNum2 = document.querySelector("#inputNum2");
let inputNum3 = document.querySelector("#inputNum3");
let inputNum4 = document.querySelector("#inputNum4");
let Result = document.querySelector("#Result");
let btCalcular= document.querySelector("#btCalcular");
let num1;
let num2;
let num3; 
let num4;

// função que será executada ao clicar no botão
function calcular(){
    num1=Number(inputNum1.value);
    num2=Number(inputNum2.value);
    num3=Number(inputNum3.value);
    num4=Number(inputNum4.value);
    if(num1<num2 && num1 <num3 && num1<num4){
        Result.textContent="O menor é "+num1
    }else if(num2<num3 && num2<num4){
        Result.textContent="O menor é "+num2
    }else if(num3<num4){
        Result.textContent="O menor é "+num3
    }else{
        Result.textContent="O menor é "+num4

}
}

// função para o botão

btCalcular.onclick = function(){
    calcular();
}




    
    

    
    

