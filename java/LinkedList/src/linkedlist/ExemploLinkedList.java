/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ExemploLinkedList {

    public static void main(String[] args) {
        // Criação de uma LinkedList para armazenar números inteiros
        LinkedList<Integer> numeros = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        String continuar;

        // Loop para receber os números digitados pelo usuário
        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
            numeros.add(numero); // Adiciona o número à LinkedList

            System.out.print("Deseja adicionar mais números? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Exibe os números armazenados
        System.out.println("Números armazenados: " + numeros);

        // Calcula a soma total dos números
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        // Exibe a soma total
        System.out.println("Soma total: " + soma);

        // Mostra o primeiro e o último elemento da lista
        if (!numeros.isEmpty()) {
            System.out.println("Primeiro número: " + numeros.getFirst());
            System.out.println("Último número: " + numeros.getLast());
        }

        // Remove o primeiro número da lista
        if (!numeros.isEmpty()) {
            numeros.removeFirst();
            System.out.println("Depois de remover o primeiro número: " + numeros);
        }

        // Fecha o scanner
        scanner.close();
    }
}

