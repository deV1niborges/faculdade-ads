function divide(a, b) {
  if (b === 0) {
    throw new Error("Divisão por zero não é permitida");
  }
  return a / b;
}

try {
  const resultado = divide(10, 0);
  console.log(resultado);
} catch (error) {
  console.log("Ocorreu uma exceção: " + error.message);
}

const numeros = [1, 2, 3, 4, 5];

try {
  const numbers = numeros.map((num) => {
    if (typeof num !== "number") {
      throw new Error("O array so pode conter números");
    }
    return num * 2;
  });
  console.log(numbers);
} catch (error) {
  console.log("Ocorreu uma exceção: " + error.message);
}

function processName(nome, callback) {
  if (typeof nome !== "string") {
    callback(new Error("O nome deve ser uma string"));
    return;
  }

  if (nome.length === 0) {
    callback(new Error("O nome não pode estar vázio"));
    return;
  }

  callback(null, "Nome processado com sucesso");
}

processName("Vinicius", (error, result) => {
  if (error) {
    console.log("Ocorreu um problema: " + error.message);
  } else {
    console.log(result);
  }
});

function checkPositive(numeros) {
  if (!Array.isArray(numeros)) {
    throw new Error("O argumento deve ser de um array");
  }

  const allPositive = numeros.every((num) => num > 0);
  if (!allPositive) {
    throw new Error("O array deve conter apenas números Positivos");
  }
  return true;
}

try {
  const numbers = [-3];

  const isPositive = checkPositive(numbers);
  console.log(isPositive)

} catch (error) {
  console.log("Ocorreu um erro: " + error.message);
}
