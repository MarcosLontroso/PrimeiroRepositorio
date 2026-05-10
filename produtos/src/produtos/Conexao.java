package produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:postgresql://localhost:5432/base_produtos";
    private static final String USER = "postgres";
    private static final String PASSWORD = "06410641";

    public static Connection getConnection() {
        try { return DriverManager.getConnection(URL, USER, PASSWORD); } 
        catch (SQLException error) {
            error.printStackTrace();
            System.out.println("Falha na conexão!" + error.getMessage());
            return null;
        }
        
    }
}
