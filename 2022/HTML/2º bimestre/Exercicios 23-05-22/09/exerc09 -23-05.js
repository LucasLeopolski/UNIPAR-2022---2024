let inputAlunos=document.querySelector("#inputAlunos");
let inputTurmas=document.querySelector("#inputTurmas");
let btCalc=document.querySelector("#btCalc");
let calcularTurma=document.querySelector("#calcularTurma");
let calcularResto=document.querySelector("#calcularResto");
let alunos;
let turmas;
let divisao;

function operacao(){
    alunos=Number(inputAlunos.value);
    turmas=Number(inputTurmas.value);
    divisao=Math.floor(alunos/turmas);
    resto=alunos%turmas
    calcularTurma.textContent="A quantidade de alunos por turma é: "+divisao;
    calcularResto.textContent="E os alunos que ficaram sem turma são: "+resto;
    }
    
btCalc.onclick=function(){
    operacao();
}