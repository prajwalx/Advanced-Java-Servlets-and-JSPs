<html>
  <%@ page import="java.sql.*,java.util.*" %>
 
  <%
    try
    {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","a");
	 
	 String rollNo=request.getParameter("txtRollNo");
	 
	 Statement stmt = con.createStatement();
	 
	 ResultSet rs=stmt.executeQuery("select * from tblStudent where ColRollNo = ' "+ rollNo +" ' ");
  
    
  %>
  
  <%@ include file="/index.html" %>
  
  <%
     if(rs.next())
	 {
  %>
      
	   <table>
	     <tr><td>Roll No:</td> <td> <%=rs.getString(1)%> </td> </tr>
         <tr><td>Name:</td> <td> <%=rs.getString(2)%> </td> </tr>
		 <tr><td>Marks:</td> <td> <%=rs.getString(3)%> </td> </tr>
       </table>
	   
	   <%
	    }
		else
		{
		 out.println("Record Not Found");
		}
		
	}
	 catch(Exception e)
	 {
	  out.println(e.getMessage());
	  e.printStackTrace();
	 }
	   %>

</html>