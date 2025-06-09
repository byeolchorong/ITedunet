<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 데이터베이스 연결 -->
<%
	Connection conn = null;	
	
	// 데이터베이스 위치
	String url = "jdbc:mysql://localhost:3306/BookmarketDB";
	// 접속 id
	String user = "root";
	String pw = "1234";
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url, user, pw);
	
	if(conn == null) {
		System.out.println("데이터베이스 연결X");
	} else {
		System.out.println("데이터베이스 연결O");
	}
%>
	
<%
	String id = request.getParameter("id");
	String password = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	System.out.println(id);
	System.out.println(password);
	System.out.println(name);
	
	Statement stmt = null;
	// 항상 sql을 완성시키고 워크벤치에서 테스트하고 변수처리한다.
	String sql = "insert into member(id,passwd,name) values('"+id+"','"+password+"','"+name+"')";
	/* 
	"insert into member(id,passwd,name) values('"
	+id+
	"','"
	+password+
	"','"
	+name+
	"')";
	*/
	
	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
%>
</body>
</html>