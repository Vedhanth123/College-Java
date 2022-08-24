// 1) import jdbc
import java.sql.*;
import java.lang.*;
import java.io.*;

public class Practice
{
    // 2) Load and tegister driver class
    Class.forName("oracle.jdbc.driver.OracleDriver");

    // 3) Creating a connection object
    Connection conn = DriverManager.getConnection("oracle.jdbc.thin:@localhost:1521:xe","root","root");

    // 4) Creating statement object
    Statement stmt = conn.createStatement();

    // Executing the Query
    ResultSet rs = stml.executeQuery("update Employee"):

    stmt.close();

    conn.close();
    
}
