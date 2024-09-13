/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

public class Fila<T> {
    private Nodo<T> frente;  // Frente da fila
    private Nodo<T> fundo;   // Fundo da fila
    private int tamanho;     // Número de elementos na fila

    // Classe Nodo para armazenar dados e link para o próximo nodo
    private static class Nodo<T> {
        T dado;
        Nodo<T> proximo;

        Nodo(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    // Construtor para inicializar uma fila vazia
    public Fila() {
        frente = null;
        fundo = null;
        tamanho = 0;
    }

    // Método para adicionar um elemento à fila
    public void enfileirar(T item) {
        Nodo<T> novoNodo = new Nodo<>(item);
        if (fundo == null) {
            // Se a fila está vazia, o novo nodo é tanto o frente quanto o fundo
            frente = fundo = novoNodo;
        } else {
            // Adiciona o novo nodo no final e atualiza o fundo
            fundo.proximo = novoNodo;
            fundo = novoNodo;
        }
        tamanho++;
    }

    // Método para remover e retornar o elemento da frente da fila
    public T desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        T item = frente.dado;
        frente = frente.proximo;
        if (frente == null) {
            // Se a fila ficar vazia, atualiza o fundo para null
            fundo = null;
        }
        tamanho--;
        return item;
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para obter o tamanho da fila
    public int tamanho() {
        return tamanho;
    }

    // Método para obter o elemento da frente sem removê-lo
    public T espiar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return frente.dado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> atual = frente;
        while (atual != null) {
            sb.append(atual.dado).append(" ");
            atual = atual.proximo;
        }
        return sb.toString().trim();
    }
}
