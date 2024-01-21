let inputValor=document.querySelector("#inputValor");
let inputMeta=document.querySelector("#inputMeta");
let inputMetaMinim=document.querySelector("#inputMetaMinim");
let btCalc=document.querySelector("#btCalc");
let calc=document.querySelector("#calc");
let valor;
let meta;
let metaMin;

function operacao(){
    valor=Number(inputValor.value);
    meta=Number(inputMeta.value);
    metaMin=Number(inputMetaMinim.value);
    if(valor===meta){
        calc.textContent="Você atingiu a meta, parabéns!"
    }else if(valor>=metaMin && valor <meta){
        calc.textContent="Você atingiu a meta minima."
    }else if(valor<metaMin){
        calc.textContent="Você não atingiu a meta minima de vendas!"
    }else{
        calc.textContent="Parabéns, você superou a meta de vendas!"
    } 

    }
    
    btCalc.onclick=function(){
        operacao();
    }
