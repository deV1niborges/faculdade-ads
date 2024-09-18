/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparatorjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}

class ComparadorPorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.idade, p2.idade);
    }
}

public class ExemploComparator {
    public static void main(String[] args) {
        // Criação de uma lista de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Ana", 20));

        // Ordenação da lista de pessoas pela idade
        Collections.sort(pessoas, new ComparadorPorIdade());

        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
