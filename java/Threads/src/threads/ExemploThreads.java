/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

class MinhaThread extends Thread {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + ": " + i);
            try {
                Thread.sleep(500); // Pausa de 500 milissegundos
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida: " + nome);
            }
        }
    }
}

public class ExemploThreads {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("Thread 1");
        MinhaThread thread2 = new MinhaThread("Thread 2");

        thread1.start(); // Inicia a primeira thread
        thread2.start(); // Inicia a segunda thread
    }
}




