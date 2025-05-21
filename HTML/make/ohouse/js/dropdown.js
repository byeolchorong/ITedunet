// 글쓰기 드롭다운
let main = document.querySelector("#ht_mainList");
let sub = document.querySelector("#ht_subList");
console.log(main);
console.log(sub);

main.addEventListener("click",showSubList);

let cnt = 0;

function showSubList() {
  cnt++;

  if(cnt % 2 == 1) {
    sub.classList.remove("ht_display_none");
  } else {
    sub.classList.add("ht_display_none");
  }
}


// 인기검색순위 드롭다운
let searchMain = document.querySelector("#search_mainList");
let searchSub = document.querySelector("#search_subList"); 

searchMain.addEventListener("click", showSearchSubList);

let search_Cnt = 0;

function showSearchSubList() {
  search_Cnt++; // 여기 변수명이 정확히 맞아야 합니다

  if (search_Cnt % 2 == 1) {
    searchSub.classList.remove("search_display_none");
  } else {
    searchSub.classList.add("search_display_none");
  }
}