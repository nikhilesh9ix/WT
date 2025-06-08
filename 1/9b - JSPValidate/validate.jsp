<%@ page language="java" %>
<html>
  <body>
     <%
         String uname = request.getParameter("username");
         int age = Integer.parseInt(request.getParameter("age"));
      
         if(age>=18)
             out.println("Welcome "+uname+"!");
         else
             out.println("Sorry!You are not an authorized user!");
     %>
  </body>
</html>