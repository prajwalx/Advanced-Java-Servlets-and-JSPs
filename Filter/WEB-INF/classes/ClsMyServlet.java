import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ClsMyServlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
res.setContentType("text/html");

PrintWriter obj=res.getWriter();

String strName=req.getParameter("txtName");

if(strName.equals("aptec"))
obj.println("Welcome");

else
obj.println("Invalid User Name");

}
}