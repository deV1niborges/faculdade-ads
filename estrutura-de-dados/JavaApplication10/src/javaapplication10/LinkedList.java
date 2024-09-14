package javaapplication10;

public class LinkedList {
    Node head;

    // Construtor
    public LinkedList() {
        this.head = null; // Lista inicialmente vazia
    }

    // Adicionar elemento à lista
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Imprimir lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // "Destruir" lista (ou liberar a memória)
    public void destroyList() {
        head = null; // Simplesmente remove a referência à cabeça da lista
        System.gc(); // Solicita ao Garbage Collector para liberar memória (opcional, o GC é automático)
    }
}


