<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.training.web.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=(String)request.getAttribute("name");
List<Login> l=(ArrayList<Login>)request.getAttribute("ArrList");
%>
<table>
<%
for(Login name:l)
{%>
<tr>
	<td><% out.println(name);%></td>
	</tr>
	<%} %>
</table>
</body>
</html>