<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	<h1>🎉여긴 홈이야🎉</h1>
	
	<!-- 케이스1 html -->
	<h3>간단한 ajax 테스트 케이스1</h3>
	<button id="b1">테스트 케이스1</button>
	<div id="result1"></div>
	
	<!-- 케이스1 자바스크립트 -->
	<script>
		var btn = document.querySelector("#b1");
		console.log(btn);
		btn.addEventListener("click",case1)
		var obj = {"name":"kim","age":"30"};
		function case1() {
			console.log("케이스실행1");
			$.ajax({
				url : "case1",
				type : "post",
				data : JSON.stringify(obj),
				contentType : "application/json",
				success : function(data) {
					alert("success");
					$("#result1").text("응답 : " + data);
				},
				error : function(errorThrown) {
					alert("fail");
				}
			});
		}
	</script>
	
	<!-- 케이스2 html -->
	<h3>간단한 ajax 테스트 케이스2</h3>
	<input type="text" id="text2">
	<button id="b2">테스트 케이스2</button>
	<div id="result2"></div>
	
	<!-- 케이스2 자바스크립트 -->
	<script>
	var btn = document.querySelector("#b2");
	console.log(btn);
	btn.addEventListener("click",case2)
	
	function case2() {
		console.log("케이스실행2");
		var inputdata = document.querySelector("#text2").value;
		$.ajax({
			url : "case2",
			type : "post",
			/* data : {id:inputdata}, */
			data : JSON.stringify({id:inputdata}),
			contentType : "application/json",
			success : function(data) {
				alert(JSON.stringify(data));
				$("#result2").text("응답 : " + data.id);
			},
			error : function(errorThrown) {
				alert("fail");
			}
		});
	}
	</script>
	
	<!-- 케이스3 html -->
	<h3>간단한 ajax 테스트 케이스3</h3>
	<input type="text" id="text3">
	<button id="b3">테스트 케이스3</button>
	<div id="result3"></div>
	
	<!-- 케이스3 자바스크립트 -->
	<script>
	var btn = document.querySelector("#b3");
	console.log(btn);
	btn.addEventListener("click",case3)
	
	function case3() {
		console.log("케이스실행3");
		var inputdata = document.querySelector("#text3").value;
		console.log(btn);
		$.ajax({
			url : "case3",
			type : "post",
			/* data : {id:inputdata}, */
			data : JSON.stringify({id:inputdata}),
			contentType : "application/json",
			success : function(data) {
				alert(JSON.stringify(data));
				$("#result3").empty();
				$("#result3").select();
				$.each(data, function(i,dto) {
					$("#result3").append("<li>" + dto.id + " "+ dto.name + "</li>")
				});
			},
			error : function(errorThrown) {
				alert("fail");
			}
		});
	}
	</script>
	
</body>
</html>