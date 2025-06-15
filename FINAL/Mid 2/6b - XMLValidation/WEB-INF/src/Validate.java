import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet
{
  protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
  {
     PrintWriter out = response.getWriter();
     String user = request.getParameter("username");
     String word = request.getParameter("password");
 
     ServletConfig cg = getServletConfig();
     Boolean flag = false;

     Enumeration e = cg.getInitParameterNames();
  
     while(e.hasMoreElements())
     {
        String u1 = (String) e.nextElement();
        String p1 = cg.getInitParameter(u1);
        if(u1.equals(user) && p1.equals(word))
        {
             flag = true;
             break;
        }
     }
     if(flag == true)
          out.println("Welcome "+user);
     else
          out.println("Sorry you are not an authorized user");
     out.close();
  }
}