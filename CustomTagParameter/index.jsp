<html>
  <%@ taglib uri = "WEB-INF/tldCustomTag.tld" prefix = "my" %>
  
  <b></br>This is the example of custom tag.Page contains the content of custom action.</b>
  <my:CustomTag name = '<%=request.getParameter("txtName")%>' >
    </br>This is the body content
  </my:CustomTag>
  
  </br>Footer of JSP File
</html>