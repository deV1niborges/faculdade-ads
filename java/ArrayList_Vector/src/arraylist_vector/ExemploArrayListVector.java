/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_vector;

import java.util.ArrayList;
import java.util.Vector;

public class ExemploArrayListVector {

    public static void main(String[] args) {
        // Criação de uma lista ArrayList para armazenar números inteiros
        ArrayList<Integer> arrayListNumeros = new ArrayList<>();
        
        // Adicionando elementos ao ArrayList
        arrayListNumeros.add(10);
        arrayListNumeros.add(20);
        arrayListNumeros.add(30);
        
        // Exibe os elementos do ArrayList
        System.out.println("Elementos do ArrayList: " + arrayListNumeros);
        
        // Calculando a soma dos elementos do ArrayList
        int somaArrayList = 0;
        for (int num : arrayListNumeros) {
            somaArrayList += num;
        }
        System.out.println("Soma total no ArrayList: " + somaArrayList);

        // Criação de uma lista Vector para armazenar números inteiros
        Vector<Integer> vectorNumeros = new Vector<>();
        
        // Adicionando elementos ao Vector
        vectorNumeros.add(40);
        vectorNumeros.add(50);
        vectorNumeros.add(60);
        
        // Exibe os elementos do Vector
        System.out.println("Elementos do Vector: " + vectorNumeros);
        
        // Calculando a soma dos elementos do Vector
        int somaVector = 0;
        for (int num : vectorNumeros) {
            somaVector += num;
        }
        System.out.println("Soma total no Vector: " + somaVector);
    }
}

