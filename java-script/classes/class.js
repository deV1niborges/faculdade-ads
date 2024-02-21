class ContaCliente {
  constructor(numeroConta, saldo, debito, credito) {
    this.numeroConta = numeroConta;
    this.saldo = parseFloat(saldo);
    this.debito = parseFloat(debito);
    this.credito = parseFloat(credito);
  }

  calcularSaldo() {
    return this.saldo - this.debito + this.credito;
  }

  verificarSaldo() {
    const saldoAtual = this.calcularSaldo();
    if (saldoAtual >= 0) {
      console.log("Saldo positivo R$ " + saldoAtual.toFixed(2));
    } else {
      console.log("Saldo negativo R$ " + saldoAtual.toFixed(2));
    }
  }
}

const modes = require("readline-sync");

let numeroConta = modes.question("Digite o numero da conta do cliente:\n");
let saldo = modes.question("Digite o saldo do cliente:\n");
let debito = modes.question("Digite o debito do cliente:\n");
let credito = modes.question("Digite o credito do cliente:\n");

let conta = new ContaCliente(numeroConta, saldo, debito, credito);

conta.verificarSaldo();
