import java.sql.*;

public class JavaDML
{
    // 2) Load and register driver class
    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    // 3) Create connection object
    Connection conn = DriverManager.getConnection("jdbc.oracle.thin:@localhost:1521:xe", "username", "password");

    // 4) create statement object
    Statement stmt = conn.createStatement();

    // 5) execute the query
    ResultSet rs = stml.executeQuery("update Employee set amount = " + 1000 + " where name = " + "Java");


    // 7) close the connection
    stmt.close();
    conn.close();
    
}


//