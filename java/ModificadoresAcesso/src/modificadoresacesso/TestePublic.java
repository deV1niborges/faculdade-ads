package modificadoresacesso;

public class TestePublic {
    public static void main(String[] args) {
        ExemploPublic obj = new ExemploPublic("Maria");
        obj.exibirNome(); // Pode ser acessado de qualquer lugar
    }
}
