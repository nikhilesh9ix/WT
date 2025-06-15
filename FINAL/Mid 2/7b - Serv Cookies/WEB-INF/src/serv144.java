import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class serv144 extends HttpServlet
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
   PrintWriter out = response.getWriter();

   Cookie ck[] = request.getCookies();

   for(int i=0;i<ck.length;i++)
   {
       out.println(ck[i].getName()+" "+ck[i].getValue());
   }
}
} 