<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
 <html>
<body>
<br><br><h2>DISPLAY PAGE</h2>
NAME      : <s:property value="name"/><br><br>
PLACE     : <s:property value = "place"/><br><br>
MOBILE    :<s:property value = "%{mob}"/><br><br>
GENDER    :<s:property value = "%{gen}"/><br><br>
EDUCATION : <s:property value = "%{edu}"/><br><br>
DEPARTMENT : <s:property value = "%{dept}"/><br><br>
</body>
</html>
