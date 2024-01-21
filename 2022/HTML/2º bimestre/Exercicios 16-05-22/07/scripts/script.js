let num1 = document.querySelector("#num1");
let num2 = document.querySelector("#num2");
let num3 = document.querySelector("#num3");
let num4 = document.querySelector("#num4");
let num5 = document.querySelector("#num5");
let num6 = document.querySelector("#num6");
let media1 = document.querySelector("#media1");
let media2 = document.querySelector("#media2");
let somaMedias = document.querySelector("#somaMedias");
let mediaTotal = document.querySelector("#mediaTotal");
let btCalc = document.querySelector("#btCalc");
let resul1 = document.querySelector("#resul1");
let resul2 = document.querySelector("#resul2");
let resul3 = document.querySelector("#resul3");
let resul4 = document.querySelector("#resul4");
let mda1;
let mda2;
let soma1;
let mdaTot;



function mediaPrimeira() {
    mda1 = (Number(num1.value) + Number(num2.value) + Number(num3.value)) / 3
    resul1.textContent = "A media dos três primeiros números é: " + mda1;
}
function mediaSegunda() {
    mda2 = (Number(num4.value) + Number(num5.value) + Number(num6.value)) / 3
    resul2.textContent = "A media dos três ultimos números é: " + mda2;
}

function somar() {
    soma1 = (mda1 + mda2)
    resul3.textContent = "A soma das duas médias é: " + soma1;
}
function media() {
    mdaTot = (mda1 + mda2) / 2
    resul4.textContent = "A média total é: " + mdaTot;
}


btCalc.onclick = function () {
    mediaPrimeira();
    mediaSegunda();
    somar();
    media();
}

