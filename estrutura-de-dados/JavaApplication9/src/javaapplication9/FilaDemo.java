package javaapplication9;

public class FilaDemo {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        // Adiciona elementos à fila
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        // Exibe a fila
        System.out.println("Fila: " + fila);

        // Espia o elemento da frente
        System.out.println("Elemento da frente: " + fila.espiar());

        // Remove elementos da fila
        System.out.println("Removido: " + fila.desenfileirar());
        System.out.println("Removido: " + fila.desenfileirar());

        // Exibe a fila após remoções
        System.out.println("Fila após remoções: " + fila);

        // Verifica o tamanho da fila
        System.out.println("Tamanho da fila: " + fila.tamanho());
    }
}
