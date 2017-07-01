package pkgCustomTag;

import java.io.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ClsCustomTag extends TagSupport
{
    int count;
	
	public void setCount(int count)
	{
	  this.count=count;
	}
	
	public int doStartTag()
	{
	  try
	  {
         JspWriter out = pageContext.getOut();
         out.println("</br>Start Tag is Encountered");		 
		 
	  }
	  catch(IOException e)
	   {
	   }
	   
	     return(EVAL_BODY_INCLUDE);
	}
	
	public int doAfterBody()
	{
     if(count<5)
	 {
	    count++;
		return(EVAL_BODY_AGAIN);
	 }
	 return(SKIP_BODY);
	}
	public int doEndTag()
	{
	  try
	  {
         JspWriter out = pageContext.getOut();
         out.println("</br>End Tag is Encountered");		 
		 
	  }
	  catch(IOException e)
	   {
	   }
	   
	     return(EVAL_PAGE);
	}
	
}