<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri ="/struts-tags"%>
<html>
    <body>
         <br><br><h2>ENTER FOLLOWING DETAILS</h2>
         <s:form action="signup">
            <s:textfield key="uname1" value="" label="ENTER USERNAME"/>
            <s:textfield key="upass1" value="" label="ENTER PASSWORD"/>
            <s:textfield key="NAME" value = "" label="ENTER NAME"/>
            <s:textfield key="PLACE" value = "" label="ENTER PLACE"/>
            <s:textfield key="MOBILE"  value = "" label="ENTER MOBILE"/>
            <s:textfield key="GENDER" value = ""  label="ENTER GENDER"/>
            <s:textfield key="EDUCATION" value = "" label="ENTER EDUCATION QUALIFICATION"/>
            <s:textfield key="DEPARTMENT" value= "" label="ENTER YOUR DEPARTMENT"/>
            <s:submit value="ENTER"/>
        </s:form>
    </body>
</html>