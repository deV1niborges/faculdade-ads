let carro = [
  {
    modelo: "Audio A3",
    marca: "Audi",
    ano: "2020",
  },
  {
    modelo: "Civic",
    marca: "Honda",
    ano: "2020",
  },
];

for (let caracter in carro) {
  console.log(carro[caracter]);
}

for (let car of carro) {
  console.log(car.modelo);
}

let numero = 1;

while (numero <= 10) {
  console.log(numero);
  numero++;
}

let c = 1;

do {
  console.log(c);
  c++;
} while (c < 6);

const carros = {

  modelo: 'Audi A3',

  marca: 'Audi',

  ano: 2020

};


