/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

public class Operadores {
   
    public static void main(String[] args) {
        int valor;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        valor = teclado.nextInt();

        System.out.println(valor/2);
        System.out.println(valor%2);

        teclado.close();
    }
    
}
