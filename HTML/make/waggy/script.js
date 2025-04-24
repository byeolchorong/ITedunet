// dropdown
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


// slider
let btn = document.querySelectorAll("label");
let slide = document.querySelectorAll(".slide");

for (let i = 0; i < btn.length; i++) {
  btn[i].addEventListener("click",sliding);
  btn[i].addEventListener("click",changeColor);
}

let index = 0;

function sliding() {
  index = parseInt (this.id.charAt(this.id.length-1));

  slide.forEach(function(slide) {
    slide.style.transform = `translateX(${index*(-100)}%)`;
  });
}

function changeColor() {
  btn.forEach(function(btn) {
    btn.classList.remove("active");
  });
  this.classList.add("active");
}




// tab
let tab = document.querySelectorAll(".tab_button span");
let contents = document.querySelectorAll(".tab_content");

for (let i = 0; i < tab.length; i++) {
  tab[i].addEventListener("click",showTabContent);
  tab[i].addEventListener("click",tabChangeColor);
}



function showTabContent() {
  let tabClass = this.id;

  contents.forEach(function(content) {
    if(tabClass === "all" || content.classList.contains(tabClass)) {
      content.style.display = "block";
    } else {
      content.style.display = "none";
    }
  })
}

function tabChangeColor() {
  tab.forEach(function(tab) {
    tab.classList.remove('active');
  });
  this.classList.add('active');
}