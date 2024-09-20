package arquivosjava;

import java.io.*;

// Classe que será serializada
class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L; // ID para controle de versão
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

public class SerializacaoExemplo {
    public static void main(String[] args) {
        // Criando objeto
        Pessoa pessoa = new Pessoa("Vini", 20);

        // Serializando o objeto
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializando o objeto
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.ser"))) {
            Pessoa pessoaDesserializada = (Pessoa) ois.readObject();
            System.out.println("Objeto desserializado: " + pessoaDesserializada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


