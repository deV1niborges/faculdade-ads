package threads;

// Classe que implementa a interface Runnable
class MinhaRunnable implements Runnable {
    private String nome;

    public MinhaRunnable(String nome) {
        this.nome = nome;
    }

    // O método run é executado quando a thread é iniciada
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + " está executando, contagem: " + i);
            try {
                // Pausa a thread por 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " terminou.");
    }
}

public class ExemploRunnable {
    public static void main(String[] args) {
        // Criando instâncias da classe que implementa Runnable
        MinhaRunnable runnable1 = new MinhaRunnable("Thread 1");
        MinhaRunnable runnable2 = new MinhaRunnable("Thread 2");

        // Criando as threads e passando os objetos Runnable
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Iniciando as threads
        thread1.start();
        thread2.start();

        // Espera as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas as threads terminaram.");
    }
}


