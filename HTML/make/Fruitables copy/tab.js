// 1. 셀렉
let tab = document.querySelectorAll(".tab");
let contents = document.querySelectorAll(".tab_content");
console.log(tab);
console.log(contents);

// 이벤트 할당
for (let i = 0; i < tab.length; i++) {
  tab[i].addEventListener("click",showTabContent);
}

// 함수 선언하기 

function showTabContent() {
  let tabClass = this.id;

  contents.forEach(function(content){
    if (tabClass === "all" || content.classList.contains(tabClass)) {
      content.style.display = "block" ;
    } else {
      content.style.display = "none"  ;
    }
  })
}