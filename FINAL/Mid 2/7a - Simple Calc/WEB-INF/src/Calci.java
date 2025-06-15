import java.io.* ;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calci extends HttpServlet
{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        int x = Integer.parseInt(request.getParameter("num1"));
        int y = Integer.parseInt(request.getParameter("num2"));
        String operator = request.getParameter("opr");
        operator = operator.trim();
        int op = Integer.parseInt(operator);
        int result = 0;
        switch(op)
        {
            case 1 : result = x + y;
                     break;
            case 2 : result = x - y; break;
            case 3 : result = x * y; break;
            case 4 : result = x/y; break;
        }
        PrintWriter pw = response.getWriter();
        pw.println("Result: "+result);
    }
}