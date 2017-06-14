import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ClsPageOne extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter prw=res.getWriter();

String strName=req.getParameter("txtName");

Cookie objCookie=new Cookie("username",strName);

res.addCookie(objCookie);

prw.println("<br>Welcome : "+strName);

prw.println("<br><a href = 'PageUnderConstruction'>Page</a>");

}

}