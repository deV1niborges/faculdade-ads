/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class ExemploHashSet {

    public static void main(String[] args) {
        // Criação de um HashSet para armazenar números inteiros
        HashSet<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;
        int numero;

        // Loop para receber os números digitados pelo usuário
        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();

            // Adiciona o número ao HashSet (não adiciona se for duplicado)
            if (numeros.add(numero)) {
                System.out.println("Número " + numero + " adicionado com sucesso!");
            } else {
                System.out.println("Número " + numero + " já existe no conjunto!");
            }

            System.out.print("Deseja adicionar mais números? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Exibe os números armazenados no HashSet
        System.out.println("Números armazenados no HashSet: " + numeros);

        // Calcula a soma dos números armazenados
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        // Exibe a soma total
        System.out.println("Soma total dos números no HashSet: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}
