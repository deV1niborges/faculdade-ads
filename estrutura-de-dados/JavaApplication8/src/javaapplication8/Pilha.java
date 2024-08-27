/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    // Construtor da pilha
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return topo == capacidade - 1;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Método para adicionar um elemento na pilha
    public void push(int elemento) {
        if (isFull()) {
            System.out.println("Pilha cheia! Não é possível adicionar mais elementos.");
        } else {
            elementos[++topo] = elemento;
        }
    }

    // Método para remover e retornar o elemento do topo da pilha
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Não é possível remover elementos.");
            return -1; // Valor de erro
        } else {
            return elementos[topo--];
        }
    }

    // Método para visualizar o elemento do topo sem remover
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Não há elementos para visualizar.");
            return -1; // Valor de erro
        } else {
            return elementos[topo];
        }
    }
}

