import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ColorGetServelet extends HttpServlet
{
    public void doGet(HttpServletRequest rq, HttpServletResponse rs)
    {
        String color = rs.getParameter("color");
        response.setContentType('text/html');
        PrintWriter pw = respone.getWriter();
        pw.println("The color is: ");
        pw.println(color);
        pw.close();
    }
}
