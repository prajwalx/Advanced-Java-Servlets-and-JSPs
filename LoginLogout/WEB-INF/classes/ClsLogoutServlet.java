import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClsLogoutServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
   res.setContentType("text/html");
   PrintWriter obj=res.getWriter();
   ServletContext sContext=getServletContext();
   String loginCount=(String) sContext.getAttribute("lcount");
   if(loginCount==null||Integer.parseInt(loginCount)<0)
   sContext.setAttribute("lcount","0");
   else
   {
   
   int c=Integer.parseInt(loginCount);
   c--;   
   sContext.setAttribute("lcount",""+c);
   }
   //show login screen once logout has been completed
   RequestDispatcher reqDispatch=req.getRequestDispatcher("index.html");
   reqDispatch.forward(req,res);
   
  }
  }