function obterValor(valor) {
  return new Promise((resolve, reject) => {
    if (valor > 10) {
      valor += 1;
      resolve(valor);
    } else {
      reject("Não foi possivel obter o valor");
    }
  });
}

function dobrarValor(valor) {
  return valor * 2;
}

function adiocionarDez(valor) {
  return valor + 10;
}

obterValor(11)
  .then((valor) => {
    console.log("valor obtido: " + valor);
    return dobrarValor(valor);
  })
  .then((novoValor) => {
    console.log("fazendo o segundo tratamento: " + novoValor);
    return adiocionarDez(novoValor);
  })
  .then((resultado) => {
    const total = resultado + 5;
    console.log("o resultado final é, " + total);
  })
  .catch((erro) => {
    console.log("ocorreu um erro: " + erro);
  });
