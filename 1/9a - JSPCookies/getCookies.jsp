<%@ page language="java"%>
<%
   Cookie ck[] = request.getCookies();
   for(int i=0;i<ck.length;i++)
   {
      out.println(ck[i].getName()+"-->"+ck[i].getValue()+"<br>");
   }
%>