let main = document.querySelector("#mainList");
let sub = document.querySelector("#subList");

main.addEventListener("click", subShowList);

let cnt = 0;

function subShowList() {
  cnt++;

  if (cnt % 2 == 1) {
    sub.classList.toggle("display_none");
  }
}