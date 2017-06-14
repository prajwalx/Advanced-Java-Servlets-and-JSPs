import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ClsPageUnderConstruction extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter prw=res.getWriter();

HttpSession obj= req.getSession();
String strName=(String) obj.getAttribute("username");
System.out.println("New Session : "+obj.isNew() );

prw.println("<br>Sorry : "+strName);

prw.println("</br> Page Under Construction");

}

}