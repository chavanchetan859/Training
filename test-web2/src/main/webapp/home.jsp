<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.training.web.Course" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<th>CourseId</th><th>CourseName</th><th>CourseDuration</th><th>CourseFee</th>
</tr>
<tr> 
	<c:forEach items="${ArrList }" var="test">  
  <td> <c:out value="${test.getCourseID()}"/><p></td>
   <td> <c:out value="${test.getCourseName()}"/><p></td>
    <td> <c:out value="${test.getCourseDuration()}"/><p></td>
     <td> <c:out value="${test.getCourseFee()}"/><p></td>  </tr>
</c:forEach>   
</table>
</body>
</html>