/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

public class MergeSortExample {

    public static void main(String[] args) {
        // Criação do vetor com os números fornecidos
        int[] vetor = {0, 8, -4, 16, -12, 17, 13, -9, 2, 11};

        // Chamada do método mergeSort
        mergeSort(vetor, 0, vetor.length - 1);

        // Exibição do vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }

    // Método para realizar o Merge Sort
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Ordena a primeira metade
            mergeSort(vetor, inicio, meio);

            // Ordena a segunda metade
            mergeSort(vetor, meio + 1, fim);

            // Faz o merge das duas metades
            merge(vetor, inicio, meio, fim);
        }
    }

    // Método para realizar o merge das duas metades
    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        // Tamanhos dos sub-arrays
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        // Arrays temporários
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia os dados para os arrays temporários
        for (int i = 0; i < n1; ++i) {
            esquerda[i] = vetor[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            direita[j] = vetor[meio + 1 + j];
        }

        // Índices iniciais dos sub-arrays e do array principal
        int i = 0, j = 0;
        int k = inicio;

        // Merge dos sub-arrays temporários de volta ao array principal
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de esquerda[], se houver
        while (i < n1) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de direita[], se houver
        while (j < n2) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }
}
