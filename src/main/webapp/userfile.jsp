<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
<html>
<body>
<br><p align="center">WELCOME <s:property value = "uname"/>!</p>
<br><br><center><s:form action="disp">
            <s:textfield key="uname" label="DISPLAY DETAILS"/>
            <s:submit value="display" key=""/>
        </s:form>
        <s:form action="modify">
                    <s:textfield key="uname" label="MODIFY DETAILS"/>
                    <s:submit value="modify"/>
                </s:form></center>
</body>
</html>