/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;

public class FatorialComCauda {

    // Método auxiliar que inicia a recursão com cauda
    public static long calcularFatorial(int n) {
        return calcularFatorialComCauda(n, 1);
    }

    // Método recursivo com cauda
    private static long calcularFatorialComCauda(int n, long acumulador) {
        if (n == 0) {
            return 1; // Fatorial de 0 é 1
        } else if (n == 1) {
            return acumulador;
        } else {
            return calcularFatorialComCauda(n - 1, n * acumulador);
        }
    }

    public static void main(String[] args) {
        // Solicita um número ao usuário
        String input = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(input);

        // Calcula o fatorial usando recursão com cauda
        long fatorial = calcularFatorial(numero);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
    }
}
