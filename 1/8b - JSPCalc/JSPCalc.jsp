<%@ page language="java"%>

<%
  int x = Integer.parseInt(request.getParameter("num1"));
  int y = Integer.parseInt(request.getParameter("num2"));

  String opr = request.getParameter("opr");
  opr = opr.trim();
  int op = Integer.parseInt(opr);
  int result = 0;
  switch(op)
  {
     case 1 : result = x + y; break;
     case 2 : result = x - y; break;
     case 3 : result = x * y; break;
     case 4 : result = x / y; break;
  }
  out.println("Result="+result);
%>