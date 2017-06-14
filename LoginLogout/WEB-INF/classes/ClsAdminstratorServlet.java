import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClsAdminstratorServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter obj=res.getWriter();
   ServletContext sContext=getServletContext();
   String loginCount=(String) sContext.getAttribute("lcount");
   
   if(loginCount==null)
   {
   loginCount="0";
   }
   obj.println("Currently Logged in Users are : "+loginCount);
   obj.println("<br> <a href='admin'> Refresh</a>");
   }
   
   }
   