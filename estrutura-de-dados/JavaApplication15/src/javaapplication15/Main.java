/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

// Definição da classe Nó
class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

// Definição da classe Árvore Binária
class ArvoreBinaria {
    No raiz;

    // Percurso em Pré-Ordem (Raiz -> Esquerda -> Direita)
    void percorrerPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percorrerPreOrdem(no.esquerda);
            percorrerPreOrdem(no.direita);
        }
    }

    // Percurso em In-Ordem (Esquerda -> Raiz -> Direita)
    void percorrerInOrdem(No no) {
        if (no != null) {
            percorrerInOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerInOrdem(no.direita);
        }
    }

    // Percurso em Pós-Ordem (Esquerda -> Direita -> Raiz)
    void percorrerPosOrdem(No no) {
        if (no != null) {
            percorrerPosOrdem(no.esquerda);
            percorrerPosOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        // Criando a árvore binária manualmente
        arvore.raiz = new No(1);
        arvore.raiz.esquerda = new No(2);
        arvore.raiz.direita = new No(3);
        arvore.raiz.esquerda.esquerda = new No(4);
        arvore.raiz.esquerda.direita = new No(5);

        System.out.println("Percurso em Pré-Ordem:");
        arvore.percorrerPreOrdem(arvore.raiz);

        System.out.println("\nPercurso em In-Ordem:");
        arvore.percorrerInOrdem(arvore.raiz);

        System.out.println("\nPercurso em Pós-Ordem:");
        arvore.percorrerPosOrdem(arvore.raiz);
    }
}
