package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    public Connection connection;

    private ConnectionSingleton() throws SQLException, ClassNotFoundException {
        // Add driver for connection
        Class.forName("org.sqlite.JDBC");

        // Connect (create) to Database
        connection = DriverManager.getConnection(
                "jdbc:sqlite:MyDatabase", "Username", "Password");

    }

    public static ConnectionSingleton getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new ConnectionSingleton();
        }
        return instance;
    }
}
