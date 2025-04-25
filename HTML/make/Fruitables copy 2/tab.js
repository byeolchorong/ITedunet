let tab = document.querySelectorAll(".tab_button span");
let content = document.querySelectorAll(".tab_content");

for (let i = 0; i < tab.length; i++) {
  tab[i].addEventListener("click",showTabContent);
  tab[i].addEventListener("click",tabChangeColor);
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

function tabChangeColor() {
  tab.forEach(function(tab) {
    tab.classList.remove("active");
  })
  this.classList.add("active");
}