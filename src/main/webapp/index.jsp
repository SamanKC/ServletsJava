<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <jsp:useBean id="obj" class="com.saman.CalcBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! int multiplyValue; %>
	<%

	 multiplyValue = obj.multiply(7);
	%>
	<%= multiplyValue %>

</body>
</html>