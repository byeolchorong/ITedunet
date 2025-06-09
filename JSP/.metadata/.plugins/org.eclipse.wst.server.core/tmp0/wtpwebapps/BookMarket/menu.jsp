<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%System.out.println("menu 입장"); %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/705381df09.js" crossorigin="anonymous"></script>

<header class="pb-3 mb-4 border-bottom">
	<a href="./welcome.jsp" class="d-flex align-items-center text-dark text-decoration-none">
		<i class="fa-solid fa-house"></i>
		<span class="fs-4">Home</span>
	</a>
	<ul class="nav nav-pills">
		<li class="nav-item"><a href="./books.jsp" class="nav-link">도서목록</a></li>
		<li class="nav-item"><a href="./addBook.jsp" class="nav-link">도서 등록</a></li>
		<li class="nav-item"><a href="./editBook.jsp?edit=update" class="nav-link">도서 수정</a></li>
		<li class="nav-item"><a href="./editBook.jsp?edit=delete" class="nav-link">도서 삭제</a></li>
	</ul>
</header>
