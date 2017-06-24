<html>
 <head>
  <title>Get and Set Properties Example</title>
 </head>
 
 <body>
   <jsp:useBean id="students" class="pkgstudent.StudentsBean">
    <jsp:setProperty name = "students" property = "firstName" value = "Amit"/>
	<jsp:setProperty name = "students" property = "lastName" value = "Sharma"/>
   </jsp:useBean>
   
   <p>Student First Name:
         <jsp:getProperty name = "students" property = "firstName"/>
   </p>
   
   <p>Student Last Name:
         <jsp:getProperty name = "students" property = "lastName"/>
   </p>
  </body>
 </html>
   
	