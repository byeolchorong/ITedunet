<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/705381df09.js" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="./resources/css/bootstrap.min.css"/>
<meta charset="UTF-8">
<title>도서 아이디 오류</title>
</head>
<body>
<div class="container py-4">
	<%@include file="menu.jsp" %>
	
	<div class="p-5 mb-4 bg-body-tertiary rounded-3">
		<div class="container-fluid py-5">
			<h1 class="alert alert-danger">해당 도서가 존재하지 않습니다.</h1>
		</div>
	</div>
	
	<div class="row align-items-md-stretch">
		<div class="col-md-12">
			<div class="h-100 p-5">
				<p> <%= request.getRequestURI() %>?<%= request.getQueryString() %>
				<p> <a href="books.jsp" class="btn btn-secondary">도서 목록 &raquo;</a>
			</div>		
		</div>
	</div>
	
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>