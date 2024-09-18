/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interatorjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterator {
    public static void main(String[] args) {
        // Criação de uma lista de inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Uso do Iterator para percorrer a lista
        Iterator<Integer> iterator = numeros.iterator();

        System.out.println("Números na lista:");
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }
    }
}

