package pkgCustomTag;

import java.io.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ClsCustomTag extends TagSupport
{
    public int doStartTag()
	{
	   try
	   {
	    JspWriter out=pageContext.getOut();
		out.println("</br> Start Tag is encountered ");
	   }
	   catch(IOException e)
	   {
	   
	   }
	   return(EVAL_BODY_INCLUDE);
	}
	
	public int doEndTag()
	{
	  try
	  {
	   JspWriter out=pageContext.getOut();
	   out.println("</br> End Tag is Encountered");
	  }
	  catch(IOException e)
	  {
	  
	  }
	  return(EVAL_PAGE);
	}
}