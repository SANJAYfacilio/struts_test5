<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
 <html>
<body>
<br><br><h2>LOGIN PAGE</h2>
<p></p>
 <s:form action = "/newuser.jsp" method="post">
 New User?<s:submit value="signup"/>
 </s:form>
<s:form action = "login" method="post">
    Login to Continue
    <s:textfield key="uname" value="" label="ENTER USERNAME"/>
    <s:textfield key="upass" value="" label="ENTER PASSWORD"/>
    <s:submit/>
    </s:form>
</body>
</html>
