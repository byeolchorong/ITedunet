let main = document.querySelector("#hb_mainList");
let sub = document.querySelector("#hb_subList");

main.addEventListener("click",showSubList);

let cnt = 0;

function showSubList() {
  cnt++;

  if (cnt % 2 == 1) {
    sub.classList.toggle("hb_display_none");
  }
}