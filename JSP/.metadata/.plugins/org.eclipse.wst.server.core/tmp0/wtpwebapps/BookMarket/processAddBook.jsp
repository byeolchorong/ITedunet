<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Book" %>
<%@ page import="dao.BookRepository" %>
<%@ page import="com.oreilly.servlet.*" %>
<%@ page import="com.oreilly.servlet.multipart.*" %>
<%@ page import="java.sql.*" %>
<%@ include file="dbconn.jsp" %>
<%System.out.println("processAddBook 입장"); %>

<%
	System.out.println("입장");

	request.setCharacterEncoding("UTF-8");
	// 입장
	// 전처리 : 전달된 데이터 받음, 유효성 검증
	
	String filename="";
	String realFolder= request.getServletContext().getRealPath("resources/images");
	int maxSize = 5 * 1024 * 1024;
	String encType = "utf-8";
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	
	String bookId = multi.getParameter("bookId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String author = multi.getParameter("author");
	String publisher = multi.getParameter("publisher");
	String releaseDate = multi.getParameter("releaseDate");
	String description = multi.getParameter("description");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	String fileName = multi.getFilesystemName("BookImage");
	
	System.out.println(bookId);
	System.out.println(name);
	System.out.println(unitPrice);
	System.out.println(author);
	System.out.println(publisher);
	System.out.println(releaseDate);
	System.out.println(description);
	System.out.println(category);
	System.out.println(unitsInStock);
	System.out.println(condition);
	
	int price;
	
	if (unitPrice.isEmpty()) {
		price=0;
	} else {
		price = Integer.valueOf(unitPrice);
	}
	
	long stock;
	
	if (unitsInStock.isEmpty()) {
		stock=0;
	} else {
		stock = Long.valueOf(unitsInStock);
	}
	
	PreparedStatement pstmt = null;
	
	String sql = "insert into book values(?,?,?,?,?,?,?,?,?,?,?)";
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, bookId);
	System.out.println("bookId");
	pstmt.setString(2, name);
	System.out.println("name");
	pstmt.setInt(3, price);
	System.out.println("price");
	pstmt.setString(4, author);
	System.out.println("author");
	pstmt.setString(5, description);
	System.out.println("description");
	pstmt.setString(6, publisher);
	System.out.println("publisher");
	pstmt.setString(7, category);
	System.out.println("category");
	pstmt.setLong(8, stock);
	System.out.println("stock");
	pstmt.setString(9, releaseDate);
	System.out.println("releaseDate");
	pstmt.setString(10, condition);
	System.out.println("condition");
	pstmt.setString(11, fileName);
	System.out.println("fileName");
	pstmt.executeUpdate();
	System.out.println("이미지 저장 경로: " + realFolder);
	System.out.println("파일명: " + fileName);
	if (pstmt != null) {pstmt.close();}
	if (conn != null) {conn.close();}
	
	response.sendRedirect("books.jsp");


%>