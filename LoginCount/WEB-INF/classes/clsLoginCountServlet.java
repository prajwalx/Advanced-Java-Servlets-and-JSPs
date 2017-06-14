import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class clsLoginCountServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter obj=res.getWriter();
try
{
ServletConfig sConfig=getServletConfig();
ServletContext sContext=sConfig.getServletContext();
String loginCount=(String) sContext.getAttribute("lcount");
if(loginCount==null)
{
sContext.setAttribute("lcount","1");
obj.println("Total Logged in Users : 1");
}
else
{
int c=Integer.parseInt(loginCount);
c++;
sContext.setAttribute("lcount",""+c);
obj.println("Total Logged in Users : "+c);
}

}
catch(Exception e)
{
e.printStackTrace();
obj.println("Error! "+e.getMessage());
}

obj.println("<center><br><a href= 'index.html'>Home </a></center>");
obj.close();
}
}
