/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

class MinhaThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando thread: " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida.");
            }
        }
    }

    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread();
        thread.start(); // Inicia a thread
    }
}



