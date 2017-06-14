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

HttpSession obj=req.getSession();

System.out.println("New Session : "+obj.isNew() );
obj.setAttribute("username",strName);

prw.println("<br>Welcome : "+strName);

prw.println("<br><a href = 'PageUnderConstruction'>Page</a>");

}

}