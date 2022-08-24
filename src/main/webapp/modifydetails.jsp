<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
 <html>
<body>
 <s:form action = "mod" method="post">
<s:textfield key="uname" label ="MODIFY DETAILS - "/><br>
<s:textfield key="name" value = "%{name} " label="NAME"/><br>
<s:textfield key="place" value ="%{place}" label="PLACE"/><br>
<s:textfield key="mob"  value ="%{mob}" label="MOBILE"/><br>
<s:textfield key="gen" value = "%{gen}" label="GENDER"/><br>
<s:textfield key="edu" value = "%{edu}" label="EDUCATION"/><br>
<s:textfield key="dept" value="%{dept}" label="DEPARTMENT"/><br>
<s:submit value="MODIFY"/>
</s:form>
</body>
</html>
