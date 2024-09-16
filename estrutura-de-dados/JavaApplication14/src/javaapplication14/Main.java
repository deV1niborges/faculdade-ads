package javaapplication14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        // Inserir alguns valores na árvore
        System.out.println("Digite cinco números inteiros para a árvore:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            bst.inserir(num);
        }

        // Exibir os valores da árvore em ordem
        System.out.println("\nValores da árvore em ordem:");
        bst.exibirEmOrdem();

        scanner.close();
    }
}

