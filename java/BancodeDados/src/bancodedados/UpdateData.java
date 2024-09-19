package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

    // Método para fazer o update de um registro na tabela 'pessoas'
    public static void update(int id, String novoNome, int novaIdade) {
        // SQL para atualizar os dados na tabela
        String updateSql = "UPDATE pessoas SET nome = ?, idade = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

            // Definindo os valores para a query de atualização
            pstmt.setString(1, novoNome);  // Novo nome
            pstmt.setInt(2, novaIdade);    // Nova idade
            pstmt.setInt(3, id);           // ID do registro a ser atualizado

            // Executa o update
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro atualizado com sucesso! ID: " + id);
            } else {
                System.out.println("Nenhum registro encontrado com o ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Atualizar o registro com ID 1 para o nome 'João' e idade 28
        update(1, "Vini", 20);

        // Atualizar o registro com ID 2 para o nome 'Maria' e idade 35
        update(2, "Emili", 20);
        
        // Atualizar o registro com ID 3 para o nome 'Noelle' e idade 4
        update(3, "Noelle", 4);
    }
}

