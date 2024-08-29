/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string;

import java.util.Scanner;

public class AlunoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos deseja cadastrar? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Nota do teste: ");
            double notaTeste = scanner.nextDouble();
            
            System.out.print("Nota da prova: ");
            double notaProva = scanner.nextDouble();
            scanner.nextLine(); 
            
            double media = (notaTeste + notaProva) / 2;
            
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);
            System.out.println("--------------------");
        }
        
        scanner.close();
    }
}

    