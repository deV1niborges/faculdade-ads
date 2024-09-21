package exemploMultithreading;

class Contador {
    private int count = 0;

    // Método sincronizado para incrementar o contador
    public synchronized void incrementar() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Contador: " + count);
    }
}

class MinhaThread extends Thread {
    private Contador contador;

    public MinhaThread(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            contador.incrementar();
            try {
                Thread.sleep(100); // Pausa para simular processamento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Criação de duas threads
        MinhaThread thread1 = new MinhaThread(contador);
        MinhaThread thread2 = new MinhaThread(contador);

        // Início das threads
        thread1.start();
        thread2.start();

        try {
            // Aguarda a finalização das threads
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finalizado!");
    }
}

