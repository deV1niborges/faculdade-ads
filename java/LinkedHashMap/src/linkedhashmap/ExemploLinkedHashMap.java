/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        // Criando um LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adicionando elementos ao LinkedHashMap
        linkedHashMap.put("Banana", 10);
        linkedHashMap.put("Maçã", 15);
        linkedHashMap.put("Laranja", 7);
        linkedHashMap.put("Manga", 12);

        // Exibindo o LinkedHashMap (ordem de inserção)
        System.out.println("LinkedHashMap (ordem de inserção):");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Fruta: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }

        // Verificando se um item existe no mapa
        String frutaProcurada = "Maçã";
        if (linkedHashMap.containsKey(frutaProcurada)) {
            System.out.println("\nA " + frutaProcurada + " está no mapa com quantidade: " + linkedHashMap.get(frutaProcurada));
        }

        // Removendo um item
        linkedHashMap.remove("Laranja");
        System.out.println("\nApós remover 'Laranja':");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Fruta: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }
}

