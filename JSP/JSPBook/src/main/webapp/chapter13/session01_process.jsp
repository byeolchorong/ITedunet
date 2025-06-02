<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		String id = (String) session.getAttribute("id");
		String pw = (String) session.getAttribute("pw");
	%>
	<a href="exam13_2">다른컨트롤러</a>
	아이디 : <%=id %>
	패스워드 : <%=pw %>
</body>
</html>