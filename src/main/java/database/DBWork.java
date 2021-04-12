package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBWork {

    private final Statement statement = ConnectionSingleton.getInstance().connection.createStatement();

    public DBWork() throws SQLException, ClassNotFoundException {
    }

    // Create table
    public boolean createTable() throws SQLException {
        boolean result = false;
        String sql ="CREATE TABLE IF NOT EXISTS Employee (id INTEGER PRIMARY KEY, name VARCHAR(50))";
            if (statement.executeUpdate(sql) > 0){
                System.out.println("Table was created");
                result = true;
            }
            else System.out.println("Table was not created");

            statement.close();
            return result;
    }
    public boolean addDataToDB() throws SQLException {
        boolean result = false;
        String sql =String.format("INSERT INTO Employee(name) VALUES ('%1$s'); " +
                "INSERT INTO Employee(name) VALUES ('%2$s')", "John", "April");
        if(statement.executeUpdate(sql) > 0){
            System.out.println("Values was added");
            result = true;
        } else System.out.println("Values was not added");

        statement.close();
        return result;

    }

    public void selectData() throws SQLException {
        ResultSet rs = statement.executeQuery("SELECT id, name" + " FROM Employee");
        while (rs.next()) {
            int employeeId = rs.getInt(1);
            String employeeName = rs.getString(2);
            System.out.println("Id:" + employeeId + "\nName:" + employeeName);
        }
        rs.close();
        statement.close();
    }
}
