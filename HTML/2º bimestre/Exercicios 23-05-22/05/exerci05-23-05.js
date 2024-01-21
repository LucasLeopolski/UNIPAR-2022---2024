let inputNomePrimPessoa=document.querySelector("#inputNomePrimPessoa");
let inputNomeSegPessoa=document.querySelector("#inputNomeSegPessoa");
let inputNomeTerceiPessoa=document.querySelector("#inputNomeTerceiPessoa");
let inputAnoPrimPessoa=document.querySelector("#inputAnoPrimPessoa");
let inputAnoSegPessoa=document.querySelector("#inputAnoSegPessoa");
let inputAnoTercPessoa=document.querySelector("#inputAnoTercPessoa");
let btCalc=document.querySelector("#btCalc");
let calculo=document.querySelector("#calculo");
let primPessoa;
let segPessoa;
let tercPessoa;

function calcMaisVelho(){
primPessoa=Number(inputAnoPrimPessoa.value);
segPessoa=Number(inputAnoSegPessoa.value);
tercPessoa=Number(inputAnoTercPessoa.value);

if (primPessoa<segPessoa && primPessoa<tercPessoa) {
   calculo.textContent= "A pessoa mais velha é: "+primPessoa;

} else if (segPessoa<tercPessoa){
    calculo.textContent="A pessoa mais velha é: "+segPessoa;    
}else{
    calculo.textContent="A pessoa mais velha é: "+tercPessoa;
}
}
btCalc.onclick= function(){
    calcMaisVelho()
}