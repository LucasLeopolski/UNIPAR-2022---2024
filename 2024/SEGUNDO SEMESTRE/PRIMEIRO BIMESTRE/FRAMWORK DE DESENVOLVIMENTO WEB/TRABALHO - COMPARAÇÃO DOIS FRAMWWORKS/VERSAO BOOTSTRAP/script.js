let usuarios = JSON.parse(localStorage.getItem('usuarios')) || [];  
let tarefas = JSON.parse(localStorage.getItem('tarefas')) || [];  
let habitos = JSON.parse(localStorage.getItem('habitos')) || [];  
let usuarioLogado = JSON.parse(localStorage.getItem('usuarioLogado')) || null;  

document.getElementById('loginForm').addEventListener('submit', function(event) {  
    event.preventDefault();  
    const email = document.getElementById('email').value;  
    const senha = document.getElementById('senha').value;  

    const usuarioEncontrado = usuarios.find(usuario => usuario.email === email && usuario.senha === senha);  

    if (usuarioEncontrado) {  
        localStorage.setItem('usuarioLogado', JSON.stringify(usuarioEncontrado));  
        window.location.href = 'index.html';  
    } else {  
        alert('Usuário ou senha inválidos.');  
    }  
});  

document.getElementById('userForm').addEventListener('submit', function(event) {  
    event.preventDefault();  
    const nome = document.getElementById('nome').value;  
    const email = document.getElementById('emailReg').value;  
    const senha = document.getElementById('senhaReg').value;  

    const usuario = { nome, email, senha };  
    usuarios.push(usuario);  
    localStorage.setItem('usuarios', JSON.stringify(usuarios));  

    alert('Usuário cadastrado com sucesso!');  
    this.reset();  
});  

document.getElementById('showRegister').addEventListener('click', function() {  
    document.getElementById('userForm').style.display = 'block';  
    document.getElementById('loginForm').style.display = 'none';  
    this.style.display = 'none';  
    document.getElementById('showLogin').style.display = 'inline';  
});  

document.getElementById('showLogin').addEventListener('click', function() {  
    document.getElementById('userForm').style.display = 'none';  
    document.getElementById('loginForm').style.display = 'block';  
    this.style.display = 'none';  
    document.getElementById('showRegister').style.display = 'inline';  
});  

document.getElementById('taskForm').addEventListener('submit', function(event) {  
    event.preventDefault();  
    const descricao = document.getElementById('descricao').value;  
    const dataInicio = document.getElementById('data_inicio').value;  
    const dataLimite = document.getElementById('data_limite').value;  

    const tarefa = { descricao, dataInicio, dataLimite };  
    tarefas.push(tarefa);  
    localStorage.setItem('tarefas', JSON.stringify(tarefas));  

    alert('Tarefa adicionada com sucesso!');  
    this.reset();  
});  

document.getElementById('habitForm').addEventListener('submit', function(event) {  
    event.preventDefault();  
    const habito = document.getElementById('habito').value;  

    habitos.push(habito);  
    localStorage.setItem('habitos', JSON.stringify(habitos));  

    alert('Hábito adicionado com sucesso!');  
    this.reset();  
    carregarHabitos(); 
});  

function carregarHabitos() {  
    const habitosList = document.getElementById('habitosList');  
    habitosList.innerHTML = ""; 

    if (usuarioLogado) {  
        for (let habito of habitos) {  
            let li = document.createElement("li");  
            li.textContent = habito;  
            habitosList.appendChild(li);  
        }  
    }  
}  

document.getElementById('historico-habitos-btn').addEventListener('click', function() {
    console.log('Button clicked!');
    window.location.href = './historico.index.html';
  });

if (usuarioLogado) {  
    document.getElementById('usuarioNome').textContent = usuarioLogado.nome;  
    carregarHabitos();  
} else {  
    window.location.href = 'login.html'; 
}  
