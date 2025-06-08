<%@ page language="java"%>
<html>
  <body>
   <jsp:useBean id = "lb1" class="prep.LoginBean"/>
   <jsp:setProperty name="lb1" property="username" param="user"/>
   <jsp:setProperty name="lb1" property="password" param="secret"/>
   //<jsp:getProperty name="lb1" property="username"/>
  
   <h1>
     <%
        boolean result = lb1.validate();
  
        if(result==true)
           out.println("Welcome, "+request.getParameter("user"));
        else
           out.println("Unauthorized user!");
     %>
   </h1>
  </body>
</html>