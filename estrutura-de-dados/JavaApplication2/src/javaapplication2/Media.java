/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import javax.swing.*;

public class Media {
    public static void main(String[] args) {

        double[] num = new double[50];
        double soma = 0;
        double media;

        for (int i = 0; i < 50; i++) {

            String input = JOptionPane.showInputDialog(null, "Digite um número:");
            
            num[i] = Double.parseDouble(input);
            
            soma += num[i];
        }
        
        media = soma / 50;
        
        JOptionPane.showMessageDialog(null, "A média das 50 notas digitadas é: " + media);
    }
}
