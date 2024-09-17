package modificadoresprotected;

class ExemploProtected {
    protected String nome;

    protected ExemploProtected(String nome) {
        this.nome = nome;
    }

    protected void exibirNome() {
        System.out.println("Nome: " + nome);
    }
}

public class TesteProtected extends ExemploProtected {
    public TesteProtected(String nome) {
        super(nome);
    }

    public static void main(String[] args) {
        TesteProtected obj = new TesteProtected("Carlos");
        obj.exibirNome(); // Pode ser acessado porque TesteProtected é uma subclasse
    }
}
