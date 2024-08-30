/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

class Animal {
    String nome;

    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }

    @Override
    void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

public class HerancaExemplo {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Rex";

        cachorro.fazerSom();       
        cachorro.abanarRabo();    
    }
}

