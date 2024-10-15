let canvas, ctx;
let player = { x: 50, y: 50, size: 10, score: 0 };
let obstacles = [];
let playerName = '';

function startGame() {
    playerName = document.getElementById('player-name').value;
    if (playerName.trim() === '') {
        alert('Por favor, digite um nome.');
        return;
    }
    document.getElementById('login-screen').style.display = 'none';
    document.getElementById('game-screen').style.display = 'block';
    canvas = document.getElementById('game-canvas');
    ctx = canvas.getContext('2d');
    canvas.width = 800;
    canvas.height = 600;
    document.addEventListener('keydown', movePlayer);
    generateObstacles();
    gameLoop();
}

function gameLoop() {
    update();
    draw();
    requestAnimationFrame(gameLoop);
}

function update() {
    // Atualizar lógica do jogo
    checkCollisions();
}

function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.fillStyle = 'green';
    ctx.fillRect(player.x, player.y, player.size, player.size);
    ctx.fillStyle = 'red';
    obstacles.forEach(obstacle => {
        ctx.fillRect(obstacle.x, obstacle.y, obstacle.size, obstacle.size);
    });
    document.getElementById('score').innerText = `Pontuação: ${player.score}`;
}

function movePlayer(event) {
    switch (event.key) {
        case 'ArrowUp':
            player.y -= 10;
            break;
        case 'ArrowDown':
            player.y += 10;
            break;
        case 'ArrowLeft':
            player.x -= 10;
            break;
        case 'ArrowRight':
            player.x += 10;
            break;
    }
}

function generateObstacles() {
    for (let i = 0; i < 10; i++) {
        obstacles.push({
            x: Math.random() * canvas.width,
            y: Math.random() * canvas.height,
            size: 20
        });
    }
}

function checkCollisions() {
    obstacles.forEach(obstacle => {
        if (player.x < obstacle.x + obstacle.size &&
            player.x + player.size > obstacle.x &&
            player.y < obstacle.y + obstacle.size &&
            player.y + player.size > obstacle.y) {
            endGame();
        }
    });
}

function endGame() {
    alert(`Fim de jogo! Sua pontuação final é: ${player.score}`);
    location.reload();
}
