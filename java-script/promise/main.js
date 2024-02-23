class operacao {
  constructor(valor) {
    this.valor = valor;
  }

  multiplicando() {
    return new Promise((resolve, reject) => {
      const result = this.valor * 2;
      if (result >= 10) {
        resolve(result + " ,Parábens o seu resultado ta na média da empresa ");
      } else {
        reject(result + " ,O seu resultado é negativo em média da empresa");
      }
    });
  }
}

const minhaclass = new operacao((this.valor = 4));
minhaclass
  .multiplicando()
  .then((resultado) => {
    console.log(resultado);
  })
  .catch((error) => {
    console.log(error);
  });

