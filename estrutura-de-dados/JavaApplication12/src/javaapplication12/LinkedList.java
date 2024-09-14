package javaapplication12;

public class LinkedList {
    Node head;

    // Construtor
    public LinkedList() {
        this.head = null; // Lista inicialmente vazia
    }

    // Adicionar elemento no início da lista
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // O novo nó aponta para o antigo início da lista
        head = newNode; // O novo nó agora é o início da lista
    }

    // Adicionar elemento no final da lista
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Lista vazia, o novo nó é o início da lista
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Percorre até o último nó
            }
            current.next = newNode; // Adiciona o novo nó ao final da lista
        }
    }

    // Mostrar lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

