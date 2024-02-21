class Dispositivo {
  constructor(nome) {
    this.nome = nome;
    this.ligado = false;
  }

  ligar() {
    if (!this.ligado) {
      this.ligado = true;
      console.log("Dispositivo ligado!");
    } else {
      console.log("O dispositivo já está ligado!");
    }
  }
}

class SmartPhone extends Dispositivo {
  constructor(nome, cor, modelo) {
    super(nome);
    this.cor = cor;
    this.modelo = modelo;
  }
}

let toCall = new SmartPhone("Iphone", "Branco", "XR");

console.log(toCall);
toCall.ligar();
