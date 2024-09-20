package arquivosjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivoLeitura {
    public static void main(String[] args) {
        try {
            // Tentar abrir um arquivo inexistente
            File arquivo = new File("exemplo.txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }
    }
}


