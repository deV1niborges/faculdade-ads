/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

public class Ordenacoes {

    public static void main(String[] args) {
        int i, vet[] = {9, 5, 1, 3, 10, 8, 4, 6, 7, 2};

        vet = bolha(vet);

        for (i = 0; i < 10; i++) {
            System.out.print(vet[i] + "  ");
        }

        System.exit(0);
    }

    public static int[] bolha(int[] vet) {
        int n = vet.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
        return vet;
    }
}
