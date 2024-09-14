package javaapplication12;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adicionar elementos no final da lista
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Mostrar lista após adicionar elementos no final
        System.out.println("Lista após adicionar no final:");
        list.printList();

        // Adicionar elementos no início da lista
        list.addFirst(5);
        list.addFirst(1);

        // Mostrar lista após adicionar elementos no início
        System.out.println("Lista após adicionar no início:");
        list.printList();
    }
}

