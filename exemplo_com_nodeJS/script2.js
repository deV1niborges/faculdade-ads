let sync = require("readline-sync");

let nome = sync.question("Qual e o seu nome?\n");
let sobreNome = sync.question("Qual e o seu sobrenome?\n");

let nomeCompleto = `${nome} ${sobreNome}`;

console.log("Seu nome completo é: " + nomeCompleto);
