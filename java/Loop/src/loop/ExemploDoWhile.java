/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loop;


import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Verificar número");
            System.out.println("2. Imprimir mensagem");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    
                    if (numero > 0) {
                        System.out.println("O número é positivo.");
                    } else if (numero < 0) {
                        System.out.println("O número é negativo.");
                    } else {
                        System.out.println("O número é zero.");
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu imprimir uma mensagem!");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }
}

