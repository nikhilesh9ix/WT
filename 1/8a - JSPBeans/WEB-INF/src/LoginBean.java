package prep;
import java.sql.*;

public class LoginBean
{
   private String username;
   private String password;

   public void setUsername(String u)
   {
      username = u;
   }
   public void setPassword(String p)
   {
      password = p;
   }
   public String getUsername()
   {
      return username;
   }
   public String getPassword()
   {
      return password;
   }

   public Boolean validate()
   {
      Connection con;
      Statement st;
      ResultSet rs;
   
      int flag = 0;
      try 
      {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtech","root","");

         st = con.createStatement();
         rs = st.executeQuery("select * from peeps");
   
         while(rs.next())
         {
            String u1 = rs.getString(1);
            String p1 = rs.getString(2);
            if(username.equals(u1) && password.equals(p1))
            {
               flag = 1;
               break;
            }
         }
         rs.close();
         st.close();
         con.close();
      }
      catch(Exception e) { }
      if(flag==1)
         return true;
      else
         return false;
   }
}

