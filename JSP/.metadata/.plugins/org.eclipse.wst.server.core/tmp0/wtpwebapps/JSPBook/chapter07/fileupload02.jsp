<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="exam7_2">
		<p> 이 름 : <input type="text" name="name">
		<p> 제 목 : <input type="text" name="subject">
		<p> 파 일1 : <input type="file" name="filename">
		<p> 파 일2 : <input type="file" name="filename2">
		<p> 파 일3 : <input type="file" name="filename3">
		<p> <input type="submit" value="파일 올리기">
	</form>
</body>
</html>