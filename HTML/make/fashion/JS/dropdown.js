let topMain = document.querySelector("#header_top_mainList");
let topSub = document.querySelector("#header_top_subList");

topMain.addEventListener("click",showTopSubList);

let topCnt = 0;

function showTopSubList() {
  topCnt++;

  if (topCnt % 2 == 1) {
    topSub.classList.toggle("top_display_none");
  } 
}


let main = document.querySelector("#mainList");
let sub = document.querySelector("#subList");

main.addEventListener("click",showSubList) ;

let cnt = 0;

function showSubList() {
  cnt++;

  if (cnt % 2 == 1) {
    sub.classList.toggle("display_none");
  } 
}