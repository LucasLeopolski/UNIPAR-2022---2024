let inputNota=document.querySelector("#inputNota");
let btResult=document.querySelector("#btResult");
let calc=document.querySelector("#calc");
let nota;

function resultado(){
    nota=Number(inputNota.value);
    if (nota<6 && nota>=4) {
        calc.textContent="Precisa fazer prova substitutiva!"
        
    } else if(nota>=6){
        calc.textContent="Aprovado!"
    }else{
        calc.textContent="Reprovado!"
    }
}

btResult.onclick=function(){
    resultado();
}