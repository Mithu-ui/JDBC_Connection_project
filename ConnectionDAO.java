package Project_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDAO {
    private static final String url="jdbc:mysql://localhost:3306/dantusrinivas";
    private static final String root="root";
    private static final String password="270706Sm";
    public static PreparedStatement getConnection(String query) throws SQLException{
    	Connection conn=DriverManager.getConnection(url,root,password);
    	System.out.println("Connection established Succesfully!");
    	return conn.prepareStatement(query);
    }
}
