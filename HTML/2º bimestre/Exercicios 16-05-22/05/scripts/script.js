let inputNum = document.querySelector("#inputNum");
let result = document.querySelector("#result");
let btCalcular = document.querySelector("#btCalcular");
let divi;

//função que sera executada ao clicar no botão

function calcular(){
    divi = Number(inputNum.value);
    if (divi%2===0){
    result.textContent= "O número inserido é par!"
   
        
    } else {
        result.textContent= "O número inserido é impar!"
    }
}

btCalcular.onclick = function(){
    calcular();
}