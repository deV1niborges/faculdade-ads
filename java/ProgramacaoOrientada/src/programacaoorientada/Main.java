/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaoorientada;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        pessoa.exibirInfo();

        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        pessoa.exibirInfo();
    }
}

