package javaapplication10;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adicionar elementos à lista
        list.add(1);
        list.add(2);
        list.add(3);

        // Imprimir lista
        System.out.println("Lista antes de destruir:");
        list.printList();

        // "Destruir" a lista
        list.destroyList();

        // Tentar imprimir a lista novamente
        System.out.println("Lista depois de destruir:");
        list.printList();
    }
}

