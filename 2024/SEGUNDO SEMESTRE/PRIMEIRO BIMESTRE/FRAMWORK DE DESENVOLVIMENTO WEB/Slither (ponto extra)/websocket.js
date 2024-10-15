const socket = new WebSocket('ws://localhost:8080');

socket.onopen = () => {
    console.log('Conectado ao servidor WebSocket');
};

socket.onmessage = (event) => {
    const ranking = JSON.parse(event.data);
    updateRanking(ranking);
};

function updateRanking(ranking) {
    const rankingList = document.getElementById('ranking-list');
    rankingList.innerHTML = '';
    ranking.forEach(player => {
        const listItem = document.createElement('li');
        listItem.innerText = `${player.name}: ${player.score}`;
        rankingList.appendChild(listItem);
    });
}

function sendScore(score) {
    socket.send(JSON.stringify({ name: playerName, score: score }));
}
