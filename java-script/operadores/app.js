let a = 20;
a *= 10; // a = a * 10

console.log(a);

let x = 201;
x--; // x = x -1

console.log(x);

let comp = a <= x;
console.log(comp);

let b = 20;
c = 29;

console.log(x === a && b != c); // os dois lados tem que ser verdadeiro para executar

if (x === a && b == c) {
  console.log("Executou");
} else {
  console.log("Uma das condições acima(if) é falsa");
}

// Operador terário

let idade = 20;

console.log(idade % 2 == 0 ? "Par" : "Impar");
