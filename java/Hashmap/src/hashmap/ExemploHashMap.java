/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criando um HashMap que mapeia strings (nomes) para inteiros (idades)
        HashMap<String, Integer> map = new HashMap<>();

        // Adicionando pares de chave-valor ao HashMap
        map.put("João", 25);
        map.put("Maria", 30);
        map.put("Pedro", 22);
        map.put("Ana", 28);

        // Acessando um valor a partir da chave
        String nome = "Maria";
        Integer idade = map.get(nome);
        if (idade != null) {
            System.out.println(nome + " tem " + idade + " anos.");
        } else {
            System.out.println(nome + " não está no HashMap.");
        }

        // Iterando sobre as chaves e valores do HashMap
        System.out.println("Lista de nomes e idades:");
        for (String key : map.keySet()) {
            System.out.println(key + " tem " + map.get(key) + " anos.");
        }

        // Verificando se o HashMap contém uma determinada chave
        if (map.containsKey("Pedro")) {
            System.out.println("O HashMap contém Pedro.");
        }

        // Removendo um item do HashMap
        map.remove("Ana");
        System.out.println("Ana foi removida do HashMap.");

        // Mostrando o conteúdo atualizado do HashMap
        System.out.println("Lista atualizada de nomes e idades:");
        for (String key : map.keySet()) {
            System.out.println(key + " tem " + map.get(key) + " anos.");
        }
    }
}
