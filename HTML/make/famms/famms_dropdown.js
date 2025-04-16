//1. 셀렉트하기
let pages = document.querySelector("#menuList_pages");
let subList = document.querySelector("#subList");
console.log(pages);

//2.이벤트 할당하기
pages.addEventListener("click", showSubList);

let cnt = 0; //클릭 횟수

//3. 함수 선언하기
function showSubList(){
  //4. 함수 내부 코드 작성하기 
  cnt++; 
  if(cnt % 2 == 1){ //클릭횟수가 홀수
    subList.classList.remove("display_none");
  }else{ //클릭횟수가 짝수
    subList.classList.add("display_none");
  }

  console.log(cnt);
}