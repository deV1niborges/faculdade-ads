package exececoesdirecionadas;

public class ExemploExcecao {
    public static void verificarNumero(int numero) throws MinhaExcecao {
        if (numero < 0) {
            throw new MinhaExcecao("Número não pode ser negativo: " + numero);
        } else {
            System.out.println("Número válido: " + numero);
        }
    }

    public static void main(String[] args) {
        try {
            verificarNumero(5); // Número válido
            verificarNumero(-3); // Isso vai lançar a exceção
        } catch (MinhaExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}

