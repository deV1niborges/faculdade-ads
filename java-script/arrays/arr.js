// Cria um array chamado "valores" com os elementos 8, 1, 7, 2 e 9.
let valores = [8, 1, 7, 2, 9];

// Imprime o valor na posição 3 do array "valores", que é 2.
console.log(valores[3]);

// Loop que percorre o array "valores" e imprime cada posição e valor correspondente.
for (var i = 0; i < valores.length; i++) {
  console.log("Posição: " + i + " Valor: " + valores[i]);
}

// Cria um array vazio chamado "carros".
let carros = [];

// Adiciona os valores "Ferrari" e "GTR" nas posições 0 e 1 do array "carros".
carros[0] = "Ferrari";
carros[1] = "GTR";

// Imprime o array "carros" no console.
console.log(carros);

// Cria um array "motos" com os valores "BMW", "Yamaha" e "Honda" e imprime no console.
let motos = new Array("BMW", "Yamaha", "Honda");
console.log(motos);

// Calcula a média dos valores no array "arr" e imprime no console.
let arr = [8, 1, 7, 2, 9];
let soma = 0;
for (var l = 0; l < arr.length; l++) {
  soma += arr[l];
}
let media = soma / arr.length;
console.log(media);

// Converte os elementos do array "arr1" em uma string separada por espaços e imprime no console.
let arr1 = [1, 2, 3, 4, 5, 6].join(" ");
console.log(typeof arr1, arr1);

// Utiliza o método splice para remover elementos do array "spliceArray".
let spliceArray = [1, 2, 3, 4, 5, 6, 7];
let spliceArray1 = spliceArray.splice(2, 1);

// Imprime os arrays após a operação de splice.
console.log(spliceArray);
console.log(spliceArray1);

// Utiliza o método splice para substituir elementos no array "nomes".
let nomes = ["Ana", "Emily", "Vini", "Samuel"];
let novos = nomes.splice(0, 1, "Maria");

// Imprime os arrays após a operação de splice.
console.log(nomes);
console.log(novos);

// Filtragem de números pares
let filtragem = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let resultado = filtragem.filter((item) => item % 2 == 0);
console.log(resultado);

// Filtragem de números menores que 5 usando uma função separada
function numerosMenores(value) {
  return value < 5;
}
let numerosEncontrados = filtragem.filter(numerosMenores);
console.log(numerosEncontrados);

// Filtragem de números maiores que 5 usando uma função anônima
let numerosFiltrados = filtragem.filter(function (value) {
  return value > 5;
});
console.log(numerosFiltrados);

// Filtragem de funcionários cujos nomes têm pelo menos 7 caracteres
let funcionarios = [
  { nome: "Davi", idade: 62 },
  { nome: "Pedro", idade: 18 },
  { nome: "Eduardo", idade: 22 },
  { nome: "João", idade: 30 },
];
var pessoasListagem = funcionarios.filter(function (value) {
  return value.nome.length >= 7;
});
console.log(pessoasListagem);

// Mapeamento: dobrar cada valor no array 'numeros'
let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
let numbers = numeros.map(function (value) {
  return value * 2;
});
console.log(numbers);

// Mapeamento: obter um array com os nomes dos funcionários
let nomesFuncionarios = funcionarios.map((pessoa) => pessoa.nome);
console.log(nomesFuncionarios);

// Usando um loop for para calcular a soma de todos os elementos em 'numeros'
let total = 0;
for (var k = 0; k < numeros.length; k++) {
  total += numeros[k];
}
console.log(total);

// Usando o método reduce para calcular a soma de todos os elementos em 'numeros'
let tot = numeros.reduce(function (total, numero) {
  return total + numero;
}, 0);
console.log(tot);

// Iterando sobre o array 'a' usando forEach e exibindo os valores
let a = [10, 20, 30, 40, 50, 60];
a.forEach((valor) => console.log(valor));

// Calculando a soma dos elementos em 'a' usando forEach
let result = 0;
a.forEach((valor) => {
  result += valor;
});
console.log(result);

// Iterando sobre 'a' e exibindo os índices
a.forEach(function(valor, indice, array) {
  console.log(indice);
});
