package javaapplication11;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adicionar elementos à lista
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Mostrar lista
        System.out.println("Lista:");
        list.printList();

        // Contar e mostrar o número de nós
        int count = list.countNodes();
        System.out.println("Número de nós na lista: " + count);
    }
}
