/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

interface Animal {
    void som(); 
}

class Cachorro implements Animal {
    public void som() {
        System.out.println("O cachorro faz: Au Au");
    }
}

class Gato implements Animal {
    public void som() {
        System.out.println("O gato faz: Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.som(); 
        gato.som();  
    }
}
