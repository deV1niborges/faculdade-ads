/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbuilder;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        // Criando um StringBuilder
        StringBuilder sb = new StringBuilder("Olá");
        
        // Adicionando texto ao final da string
        sb.append(" Mundo");
        
        // Inserindo texto em uma posição específica
        sb.insert(5, " Maravilhoso");
        
        // Revertendo a string
        sb.reverse();

        // Exibindo o resultado
        System.out.println(sb); // Saída: odnalivaraM aláO
    }
}

