// Step1. 요소 선택하기
let btns = document.querySelectorAll('label');
console.log(btns);
let slides = document.querySelectorAll('li');

// Step2. 이벤트 할당하기
for(let i = 0; i < btns.length; i++){
  btns[i].addEventListener('click',sliding);
  btns[i].addEventListener('click',changeColor);
}

let index = 0;

function sliding(){
  index = parseInt(this.id.charAt(this.id.length-1));
  console.log(index);

  slides.forEach(function(slide){
    slide.style.transform = `translateX(${index*(-100)}%)`;
  });
}

function changeColor(){
  btns.forEach(function(btn){
    btn.classList.remove('active');
  });
  this.classList.add('active');
}