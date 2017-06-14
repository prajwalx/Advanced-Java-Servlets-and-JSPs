import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClsLoginCountServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
  res.setContentType("text/html");
  PrintWriter obj=res.getWriter();
  String userId=req.getParameter("txtUserId");
  String password=req.getParameter("txtPassword");
  
  if(userId.equals("amit") && password.equals("java"))
  {
  ServletContext sContext=getServletContext();
  String loginCount=(String)sContext.getAttribute("lcount");
  if(loginCount==null||Integer.parseInt(loginCount)<0)
  {
  sContext.setAttribute("lcount","1");
  }
  
  else
  {
  int c=Integer.parseInt(loginCount);
  c++;
  sContext.setAttribute("lcount",""+c);
  }
  obj.println("Welcome "+userId);
  obj.println("<br> <a href= 'logout'>Logout</a>");
  }
  
  else
  {
  obj.println("Invalid UserID or Password");
  obj.println("<br> <a href= 'index.html'>Home</a>");
  }
  }

}