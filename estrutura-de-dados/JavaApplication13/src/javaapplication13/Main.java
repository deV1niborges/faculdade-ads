/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

// Classe que representa um nó da lista ligada
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Classe que representa a lista ligada
class LinkedList {
    Node head;

    // Método para adicionar um novo nó à lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Método para exibir todos os elementos da lista
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Recebe 10 números inteiros do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            // Verifica se o número é divisível por 3
            if (number % 3 == 0) {
                list.add(number);
            }
        }

        // Exibe todos os elementos da lista ligada
        System.out.println("Números divisíveis por 3:");
        list.display();
        
        scanner.close();
    }
}

