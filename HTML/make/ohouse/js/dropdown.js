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