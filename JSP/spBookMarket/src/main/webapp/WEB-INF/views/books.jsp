<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>도서목록</title>
</head>
<body>
	<nav>
		<div>
			<div>
				<a>Home</a>
			</div>
		</div>
	</nav>
	
	<div>
		<div>
			<h1>도서 목록</h1>
		</div>
	</div>
	
	<div>
		<div>
			<c:forEach items="${bookList}" var="book">
				<div>
					<h3>${book.name}</h3>
					<p>${book.author}</p>
						<br>${book.publisher} | ${book.releaseDate}
					<p></p>
					<p></p>
				</div>
			</c:forEach>
		</div>
		<hr>
		<footer>
			<p>&copy; BookMarket</p>
		</footer>
	</div>
</body>
</html>