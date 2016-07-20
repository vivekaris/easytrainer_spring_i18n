<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="application.name"/></title>
<style type="text/css">
.formFieldError { background-color: #FFC; }
</style>
</head>
<body>
Language :
<a href="?lang=en_US">English</a> - <a href="?lang=hi_IN">Hindi</a> - <a href="?lang=fr_FR">French</a>

Locale: ${pageContext.response.locale}

<h2><spring:message code="application.name"/></h2>
<mvc:form modelAttribute="u" action="register" method="post">
<table>
<tr>
<td><spring:message code="label.name" /></td>
<td><input type="text" name="name" /></td>
<td><mvc:errors path="name" /></td>
</tr>
<tr>
<td><spring:message code="label.address" /></td>
<td><textarea  name="address"> </textarea></td>
<td><mvc:errors path="address" /></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Submit" />
</td>
</tr>
</table>
</mvc:form>

</body>
</html>