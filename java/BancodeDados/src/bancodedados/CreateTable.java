package bancodedados;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                   + " id SERIAL PRIMARY KEY,"
                   + " nome VARCHAR(100) NOT NULL,"
                   + " idade INT NOT NULL"
                   + ");";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'pessoas' criada com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createTable();
    }
}
