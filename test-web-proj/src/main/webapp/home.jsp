<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.training.web.Users" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Data</title>
</head>
<body>
<%
String uname=(String)request.getAttribute("name");
List<Users> l=(ArrayList<Users>)request.getAttribute("ArrList");
%>
Username   Password    UserType

<table>
<% for(Users name: l){
	%>
	<tr>
	<td><% out.println(name.getUserName());%></td>
	
	
	<td><% out.println(name.getPassword());%></td>
	
	<td><% out.println(name.getUserType());%></td>
	</tr>
	<%} %>

</table>
</body>
</html>