/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

public class QuickSortExample {

    // Método para realizar o Quick Sort
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = partition(vetor, inicio, fim);

            // Recursivamente ordenar os elementos antes
            // e depois da partição
            quickSort(vetor, inicio, indiceParticao - 1);
            quickSort(vetor, indiceParticao + 1, fim);
        }
    }

    // Método para particionar o vetor
    public static int partition(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = (inicio - 1); // índice do menor elemento
        for (int j = inicio; j < fim; j++) {
            // Se o elemento atual é menor ou igual ao pivô
            if (vetor[j] <= pivo) {
                i++;

                // Trocar vetor[i] e vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        // Trocar vetor[i + 1] e vetor[fim] (ou pivô)
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    // Método para imprimir o vetor
    public static void printVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = {12, 5, -3, 4, 0, 21, 8, -7, 9, 6};

        // Ordenando o vetor usando Quick Sort
        quickSort(vetor, 0, vetor.length - 1);

        // Imprimindo o vetor ordenado
        System.out.println("Vetor ordenado:");
        printVetor(vetor);
    }
}

