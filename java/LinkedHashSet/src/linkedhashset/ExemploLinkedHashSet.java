/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashset;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        // Criação de um LinkedHashSet para armazenar números inteiros
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        // Adicionando elementos ao LinkedHashSet
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10); // Elemento duplicado, será ignorado
        
        // Exibe os elementos do LinkedHashSet
        System.out.println("Elementos do LinkedHashSet: " + numeros);
        
        // Tenta adicionar um número duplicado
        boolean adicionado = numeros.add(20); // Elemento duplicado
        System.out.println("Número 20 adicionado? " + adicionado);
        
        // Calculando a soma dos elementos no LinkedHashSet
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        // Exibe a soma total dos elementos
        System.out.println("Soma total dos números no LinkedHashSet: " + soma);
    }
}
