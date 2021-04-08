package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    // Open and Close Connection

    private static final String DRIVER = "org.postgresql.Driver";

    // Connect to localhost db
    private static final String url = "jdbc:postgresql://localhost/pokemon";
    private static final String user = "postgres";
    private static final String password = "root";

    //Open connection
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException error) {
            System.err.println("Erro: " + error);
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();

        if (connection != null) {
            System.out.println("Conectado ao server PostgreSQL!");
            connection.close();
        }
    }

}
