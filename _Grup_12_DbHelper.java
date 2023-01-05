package _grup_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _Grup_12_DbHelper {
    private String userName = "root";
    private String password = "12345678";
    private String dbUrl = "jdbc:mysql://localhost:3306/_grup_12";
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception)
    {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
