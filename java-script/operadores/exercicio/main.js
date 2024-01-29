// Exemplo de verificação de elegibilidade para uma vaga de emprego

// Dados do candidato

var idade = 20;

var experienciaAnos = 5;

var nivelEducacao = "superior";

var possuiCertificado = true;

// Critérios de elegibilidade

var idadeMinima = 18;

var experienciaMinimaAnos = 3;

var nivelEducacaoMinimo = "superior";

var certificadoObrigatorio = true;

// Verificação de elegibilidade
var elegivel =
  idade >= idadeMinima &&
  experienciaAnos >= experienciaMinimaAnos &&
  (nivelEducacao === nivelEducacaoMinimo || possuiCertificado) &&
  (!certificadoObrigatorio || possuiCertificado);

// Saída do resultado

console.log("Elegível para a vaga? " + elegivel);
