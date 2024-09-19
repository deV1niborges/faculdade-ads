package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertData {

    // Método para inserir dados na tabela 'pessoas' com verificação de duplicação
    public static void insert(String nome, int idade) {
        // SQL para verificar se o registro já existe
        String checkSql = "SELECT COUNT(*) FROM pessoas WHERE nome = ? AND idade = ?";
        
        // SQL para inserir o registro, caso ele ainda não exista
        String insertSql = "INSERT INTO pessoas (nome, idade) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.connect();
             // Preparando a verificação de duplicação
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {

            // Definindo os parâmetros para o SQL de verificação
            checkStmt.setString(1, nome);
            checkStmt.setInt(2, idade);
            
            // Executando a consulta de verificação
            ResultSet rs = checkStmt.executeQuery();
            rs.next(); // Mover para o primeiro resultado
            int count = rs.getInt(1); // Obtendo a contagem de registros

            // Se não houver registros com o mesmo nome e idade, insira o novo registro
            if (count == 0) {
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                    insertStmt.setString(1, nome);
                    insertStmt.setInt(2, idade);
                    insertStmt.executeUpdate(); // Executa a inserção
                    System.out.println("Dados inseridos com sucesso: " + nome + ", " + idade);
                }
            } else {
                // Se já existir um registro, avise que a inserção foi ignorada
                System.out.println("Registro duplicado! Nome: " + nome + ", Idade: " + idade);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Inserir dados (sem duplicação)
        insert("Joao", 25);
        insert("Maria", 30);
        insert("Pedro", 40);
    }
}
