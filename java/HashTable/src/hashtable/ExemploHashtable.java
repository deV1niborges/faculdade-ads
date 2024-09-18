/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable;

import java.util.Hashtable;

public class ExemploHashtable {
    public static void main(String[] args) {
        // Criando uma Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adicionando elementos (chave, valor)
        hashtable.put(1, "Maçã");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cereja");
        hashtable.put(4, "Damasco");

        // Exibindo os elementos da Hashtable
        System.out.println("Conteúdo da Hashtable: " + hashtable);

        // Acessando elementos com base na chave
        String fruta = hashtable.get(2);
        System.out.println("Fruta com chave 2: " + fruta);

        // Removendo um elemento
        hashtable.remove(3);
        System.out.println("Após remover a chave 3: " + hashtable);

        // Verificando se uma chave existe
        if (hashtable.containsKey(1)) {
            System.out.println("A chave 1 existe na Hashtable.");
        }

        // Verificando se um valor existe
        if (hashtable.containsValue("Banana")) {
            System.out.println("O valor 'Banana' existe na Hashtable.");
        }

        // Iterando sobre a Hashtable
        for (Integer chave : hashtable.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + hashtable.get(chave));
        }
    }
}

