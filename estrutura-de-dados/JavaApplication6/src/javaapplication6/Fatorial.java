/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import javax.swing.*;

public class Fatorial {

    // Função recursiva sem cauda para calcular o fatorial
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Criar uma janela de diálogo para receber um número do usuário
        String input = JOptionPane.showInputDialog(null, "Digite um número para calcular o fatorial:");
        
        try {
            // Converter a entrada para um número inteiro
            int numero = Integer.parseInt(input);
            
            // Calcular o fatorial usando a função recursiva
            int resultado = calcularFatorial(numero);
            
            // Exibir o resultado em uma mensagem
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + resultado);
            
        } catch (NumberFormatException e) {
            // Tratar o caso em que o usuário não insere um número válido
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
        }
    }
}

