<%@ page language="java"%>
<html>
  <body>
    <%
       String first = request.getParameter("fname");
       String last = request.getParameter("lname");
       Cookie c1 = new Cookie("firstname",first);
       Cookie c2 = new Cookie("lastname",last);
       response.addCookie(c1);
       response.addCookie(c2);
    %>
    <form action="getCookies.jsp">
      <input type="submit" value="List Cookies">
   </form>
  </body>
</html>