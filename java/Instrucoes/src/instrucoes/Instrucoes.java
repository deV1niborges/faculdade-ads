/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrucoes;

import java.util.Scanner;

public class Instrucoes {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite o valor da nota1: ");
        nota1 = input.nextDouble();


        System.out.println("Digite o valor da nota2: ");
        nota2 = input.nextDouble();


        System.out.println("Digite o valor da not3: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;


        System.out.println("A média é igual a " + media);

        if(media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Final");
        }

        input.close();
    }
    
}
