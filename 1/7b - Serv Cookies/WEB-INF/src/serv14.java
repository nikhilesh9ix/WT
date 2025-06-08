import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class serv14 extends HttpServlet
{
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
  {
     Cookie c1 = new Cookie("name","Aaron");
     Cookie c2 = new Cookie("id","7");
     Cookie c3 = new Cookie("partner","Juliette");
     Cookie c4 = new Cookie("book","Ignite");
  
     response.addCookie(c1);
     response.addCookie(c2);
     response.addCookie(c3);
     response.addCookie(c4);

     response.getWriter().println("Cookies created and sent to client side!");
  }
}