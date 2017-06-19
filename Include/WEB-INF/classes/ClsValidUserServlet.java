import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClsValidUserServlet extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
  res.setContentType("text/html");
  PrintWriter obj= res.getWriter();
 
  String userId=(String)req.getAttribute("user");
  
  obj.println("Welcome "+ userId);
  obj.println("<br>Message from Valid User Servlet");
 }
 
}