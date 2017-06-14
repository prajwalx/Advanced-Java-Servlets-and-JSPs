import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class clasServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter obj=res.getWriter();
String str=req.getParameter("txtName");
obj.println("<html><body>");
obj.println("<center><b>Hello"+str+"</b></center>");
obj.println("<br><a href='ind.html'>Home</a>");
obj.println("</body></html>");
obj.close();
}
}
