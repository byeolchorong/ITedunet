<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>To Do List</title>
<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="<c:url value='/resources/css/todos.css' />" rel="stylesheet">
</head>
<body>

<div class="container mt-5" style="max-width: 600px;">
    <h2 class="text-center mb-4 fw-bold">To Do List</h2>

    <!-- 할 일 추가 폼 -->
    <form action="${pageContext.request.contextPath}/todos/add" method="post" class="d-flex gap-2 mb-4">
        <input type="text" name="content" class="form-control" placeholder="일정을 추가하세요" required />
        <button type="submit" class="btn btn-pink px-3">일정 추가</button>
    </form>

    <!-- 할 일 목록 출력 -->
    <c:forEach var="todo" items="${todos}">
        <div class="card mb-3 shadow-sm">
            <div class="card-body d-flex justify-content-between align-items-center">
                <div>
                    <span class="text-muted small">${todo.createdDate}</span><br/>
                    <span class="${todo.completed ? 'text-done' : 'fw-semibold'}">
                        ${todo.content}
                    </span>
                </div>
                <div class="d-flex gap-2">
                    <c:if test="${!todo.completed}">
                        <form action="${pageContext.request.contextPath}/todos/complete/${todo.id}" method="post">
                            <button type="submit" class="btn btn-outline-success btn-sm">완료</button>
                        </form>
                    </c:if>
                    <form action="${pageContext.request.contextPath}/todos/delete/${todo.id}" method="post">
                        <button type="submit" class="btn btn-outline-secondary btn-sm">삭제</button>
                    </form>
                </div>
            </div>
        </div>
    </c:forEach>

</div>

</body>
</html>
