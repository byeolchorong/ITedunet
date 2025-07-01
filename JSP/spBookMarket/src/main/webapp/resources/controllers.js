function addToCart(action){
	console.log("들어옴");
	document.addForm.action = action;
	document.addForm.submit();
	alert("도서가 장바구니에 추가되었습니다!!");
}

function removeFromCart(action){
	console.log("delete들어옴");
	document.removeForm.action = action;
	document.removeForm.submit();
	console.log("remove submit함");
	//요청하고 함수실행하고 리로드해야하는데 그냥 리로드해버려서 setTimeOut을 꼭해야함
	alert("도서 개별 삭제 !");
}

function clearCart(){
	console.log("clear들어옴");
	document.clearForm.submit();
	alert("도서 전체 삭제 !");
}

function deleteConfirm(id) {
	console.log("📌 bookId:", bookId);
	console.log("delete들어옴");
	if (confirm("삭제합니다!!") == true) location.href = "./delete?id=" + id;
	else return;
}