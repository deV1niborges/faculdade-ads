package modificadoresdefault;

class ExemploDefault {
    String nome;

    ExemploDefault(String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.println("Nome: " + nome);
    }
}

public class TesteDefault {
    public static void main(String[] args) {
        ExemploDefault obj = new ExemploDefault("Ana");
        obj.exibirNome(); // Pode ser acessado porque TesteDefault está no mesmo pacote
    }
}

