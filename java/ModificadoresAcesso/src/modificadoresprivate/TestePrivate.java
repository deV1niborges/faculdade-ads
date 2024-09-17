package modificadoresprivate;

public class TestePrivate {
    public static void main(String[] args) {
        ExemploPrivate obj = new ExemploPrivate("João");
        // obj.exibirNome(); // Erro: Método exibirNome() é privado
        obj.chamarExibirNome(); // Método público pode chamar o método privado
    }
}
