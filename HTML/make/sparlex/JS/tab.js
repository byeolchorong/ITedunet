let tab = document.querySelectorAll(".tab_buttons span");
let content = document.querySelectorAll(".tab_product");

for (let i = 0; i < tab.length; i++) {
  tab[i].addEventListener("click",showTabContent);
}

function showTabContent() {
  let tabClass = this.id;

  content.forEach(function(content) {

    if (tabClass === "all" || content.classList.contains(tabClass)) {
      content.style.display = "block";
    } else {
      content.style.display = "none";
    }
  })
}