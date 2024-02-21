class Pessoa {
  constructor(nome, sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  falar() {
    console.log("Olá " + this.nome);
  }

  getfullname() {
    console.log(this.nome + " " + this.sobrenome);
  }
}

let number1 = new Pessoa("Caio", "Lucas");

number1.falar();
number1.getfullname();
