package javaapplication8;

import java.util.Scanner;

public class PilhaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5);

        // Recebendo 5 números inteiros do usuário e adicionando-os na pilha
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            pilha.push(numero);
        }

        // Mostrando os números na ordem em que foram inseridos
        System.out.println("Números na pilha:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        scanner.close();
    }
}
