let main = document.querySelector("#mainList");
let sub = document.querySelector("#subList");

main.addEventListener("click",showSubList);

let cnt = 0;

function showSubList() {
  cnt++;

  if (cnt % 2 == 1) {
    sub.classList.toggle("display_none");
  }
}