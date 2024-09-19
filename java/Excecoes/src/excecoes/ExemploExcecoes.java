/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecoes;

public class ExemploExcecoes {

    // Método que simula uma operação que pode lançar uma exceção
    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);  // Tentativa de divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Trata exceção de divisão por zero
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Bloco finalmente será executado independentemente de erro
            System.out.println("Bloco finally executado.");
        }

        System.out.println("Programa continua após o tratamento da exceção.");
    }
}
