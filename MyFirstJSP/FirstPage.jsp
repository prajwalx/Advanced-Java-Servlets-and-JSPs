<html>

 <%!
  String strName;
  
  String displayHello()
  {
   return(" Hello "+ strName);
  }
 %>
 
 <%
  strName=request.getParameter("txtName");
  
  out.println(displayHello());
 %>
 
 </html>