import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ClsPageUnderConstruction extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter prw=res.getWriter();

Cookie[] objCookieAray=req.getCookies();

String strName=objCookieAray[0].getValue();



prw.println("<br>Sorry : "+strName);

prw.println("</br> Page Under Construction");

}

}