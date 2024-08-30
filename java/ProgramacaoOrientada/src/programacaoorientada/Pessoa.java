package programacaoorientada;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0) { 
            this.idade = idade;
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

