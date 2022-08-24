import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.http.HttpRequest;
public class Practice2 
{
    public void doGet(HttpRequest request HttpsResponse rs)
    {
        String str = request.getParameter("Color");
        rs.setContentType("text/html")
        PrintWriter pw = rs.PrintWriter();
        pw.println("Color selected is " + Color);
        pw.close();
    }    
}
