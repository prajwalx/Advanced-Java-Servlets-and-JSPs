import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class ClsRequestDispatcher extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
  res.setContentType("text/html");
  
  PrintWriter obj=res.getWriter();
  
  String userId=req.getParameter("txtUserId");
  String pwd=req.getParameter("txtPassword");
  
  if(userId.equals("aptec") && pwd.equals("java"))
  {
   String userName=userId.toUpperCase();
   
   req.setAttribute("user",userName);
   
   RequestDispatcher reqDisp=req.getRequestDispatcher("/Valid");
   
   reqDisp.include(req,res);
   
  }
  
  else
  {
   obj.println("Invalid UserId or Password");
  }
  
  obj.println("<br>Message from RequestDispatcherServlet");
 }
}