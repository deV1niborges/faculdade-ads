/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivosjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploArquivoEscrita {
    public static void main(String[] args) {
        try {
            // Criando o arquivo
            File arquivo = new File("exemplo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }

            // Escrevendo no arquivo
            FileWriter escritor = new FileWriter("exemplo.txt");
            escritor.write("Olá, esse é um exemplo de escrita em arquivo!\n");
            escritor.write("Mais uma linha de texto.");
            escritor.close();
            System.out.println("Texto foi escrito no arquivo.");
            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}

