// Importa o módulo readline-sync para interação com o usuário no console.
const readline = require("readline-sync");

// Função que recebe uma string representando a bebida e retorna uma mensagem com o valor.
function valorBebida(bebida) {
  let valor;

  // Utiliza um switch para determinar o valor com base na bebida escolhida (ignora maiúsculas/minúsculas).
  switch (bebida.toLowerCase()) {
    case "cafe":
      valor = 2.5;
      break;
    case "leite":
      valor = 3.0;
      break;
    case "cha":
      valor = 2.0;
      break;
    default:
      // Caso a bebida escolhida não seja café, leite ou chá, retorna uma mensagem de erro.
      return "Escolha inválida. Por favor, selecione entre café, leite ou chá.";
  }

  // Retorna uma mensagem com a bebida escolhida e o valor formatado em reais.
  return `Você escolheu ${bebida.toLowerCase()}. O valor a ser pago é R$ ${valor.toFixed(
    2
  )}.`;
}

// Solicita ao usuário que escolha uma bebida.
let bebidaEscolhida = readline.question(
  "Escolha a bebida (cafe, leite, cha):\n"
);

// Chama a função valorBebida com a escolha do usuário e exibe o resultado no console.
let resultado = valorBebida(bebidaEscolhida);
console.log(resultado);
