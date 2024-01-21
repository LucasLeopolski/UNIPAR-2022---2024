//criando uma variavel  referenciando o elemento html
let inputRa = document.querySelector('#inputRa');
let inputNome = document.querySelector('#inputNome');
let inputCpf = document.querySelector('#inputCpf');
let inputDtNascim = document.querySelector('#inputDtNascim');
let btSalvar = document.querySelector('#btSalvar');
let h2AlunosSalvos = document.querySelector('#h2AlunosSalvos');

/*criando função para ser executado quando clicar no btSalvar*/

function salvarAluno(){
    let ra = String(inputRa.value);  
    let nome = String(inputNome.value);
    let cpf = String(inputCpf.value);
    let dtNasc = String(inputDtNascim.value);
    let alunos = h2AlunosSalvos.innerHTML+ '<br>';
    h2AlunosSalvos.innerHTML = 'Ra:'+ra+'  | Nome:'+nome+' | CPF:'+cpf+' | Dt. Nasc.:'+dtNasc+ alunos+'<br>';

}
function limparCampos(){
    inputRa.value = '';
    inputNome.value = '';
    inputCpf.value = '';
    inputDtNascim.value = '';
}

btSalvar.onclick = function(){
    salvarAluno();
    limparCampos();
}