function myFunction() {
  let input = document.getElementById("item");
  let list = document.getElementById("list");

  if (input.value.trim() !== "") { 
     // 새 리스트 항목 생성
    let li = document.createElement("li");
    li.textContent = input.value;

    // 삭제 버튼 생성
    let deleteBtn = document.createElement("button");
    deleteBtn.textContent = "X";
    deleteBtn.classList.add("deleteBtn");
    
    // 삭제 버튼 클릭 시 해당 li 삭제
    deleteBtn.addEventListener("click", function() {
      list.removeChild(li);
    });

    // li에 삭제 버튼 추가
    li.appendChild(deleteBtn);

    // 새 리스트 항목을 ul의 마지막 자식으로 추가
    list.appendChild(li);


    // 다음 텍스트값을 추가하기 위한 과정
    input.value = ""; 
  } else {
    alert("입력된 내용이 없습니다.");
  }
}