import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet
{
  protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
  {
     PrintWriter out = response.getWriter();

     Connection con;
     PreparedStatement pst;
     ResultSet rs;
   
     String user = request.getParameter("username");
     String word = request.getParameter("password");

     try
     {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtech","root","");
         pst = con.prepareStatement("select * from peeps where username=? and password=?");
         pst.setString(1,user);
         pst.setString(2,word);
         rs= pst.executeQuery();

         if(rs.next())
             out.println("Welcome,"+user);
         else
             out.println("Sorry,you are not an authorized user");
         
         pst.close();
         rs.close();
         con.close();
     }
     catch(Exception e) { 
             
     } 
  }
}