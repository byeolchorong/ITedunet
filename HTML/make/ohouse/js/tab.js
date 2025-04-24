let tab = document.querySelectorAll(".ht_left02 a");
let contents = document.querySelectorAll("#nav .container > div");

for (let i = 0; i < tab.length; i++) {
  tab[i].addEventListener("mouseover", showNavContent);
}

function showNavContent(event) {
  let tabClass = event.target.className; // 커뮤니티 / 쇼핑 / 인테리어 등
  contents.forEach(function(content) {
    if (content.classList.contains(tabClass)) {
      content.style.display = "block";
    } else {
      content.style.display = "none";
    }
  });
}