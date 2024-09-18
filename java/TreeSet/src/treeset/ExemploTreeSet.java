/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treeset;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        // Criação de um TreeSet para armazenar números inteiros
        TreeSet<Integer> numeros = new TreeSet<>();
        
        // Adicionando elementos ao TreeSet
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(30); // Duplicado, será ignorado pelo TreeSet
        
        // Exibindo os elementos do TreeSet (ordem natural)
        System.out.println("Elementos do TreeSet (ordenados): " + numeros);
        
        // Exibe o menor e o maior elemento
        System.out.println("Menor elemento: " + numeros.first());
        System.out.println("Maior elemento: " + numeros.last());
        
        // Removendo um elemento específico
        numeros.remove(20);
        System.out.println("Elementos após remover 20: " + numeros);
        
        // Exibe os elementos menores que 40
        System.out.println("Elementos menores que 40: " + numeros.headSet(40));
        
        // Exibe os elementos maiores ou iguais a 30
        System.out.println("Elementos maiores ou iguais a 30: " + numeros.tailSet(30));
    }
}
