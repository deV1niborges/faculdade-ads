/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Cria um TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adiciona pares chave-valor ao TreeMap
        treeMap.put(3, "Três");
        treeMap.put(1, "Um");
        treeMap.put(2, "Dois");
        treeMap.put(4, "Quatro");

        // Exibe o TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Acessa um valor usando a chave
        System.out.println("Valor para a chave 2: " + treeMap.get(2));

        // Remove um par chave-valor
        treeMap.remove(3);
        System.out.println("Após remover a chave 3: " + treeMap);

        // Itera sobre as entradas do TreeMap
        System.out.println("Iterando sobre o TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
