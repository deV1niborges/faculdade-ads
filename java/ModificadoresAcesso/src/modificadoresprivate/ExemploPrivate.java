package modificadoresprivate;

public class ExemploPrivate {
    private String nome;

    public ExemploPrivate(String nome) {
        this.nome = nome;
    }

    private void exibirNome() {
        System.out.println("Nome: " + nome);
    }

    public void chamarExibirNome() {
        exibirNome(); // Pode ser acessado dentro da própria classe
    }
}


