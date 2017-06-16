import javax.servlet.*;
import java.io.*;

public class ClsFilterServlet implements Filter
{
public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException,ServletException
{
String strName=req.getParameter("txtName");

if(strName.length()==5)
   chain.doFilter(req,res);
else
   res.getWriter().println("User name not in correct format, must be 5 characters");

res.getWriter().println("Final Response from ClsFilterServlet");   
}

public void init(FilterConfig config)
{

}
public void destroy()
{

}

}