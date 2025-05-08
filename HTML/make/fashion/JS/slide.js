let left = document.querySelector(".left");
let right = document.querySelector(".right");
let slide = document.querySelectorAll(".slide");

left.addEventListener("click",leftsliding);
right.addEventListener("click",rightsliding);

let index = 0;

function leftsliding() {
  index--;

  if (index < 0) {
    index = slide.length - 1;
  }
  sliding ();
}

function rightsliding() {
  index++;

  if (index >= slide.length) {
    index = 0;
  }
  sliding();
}

function sliding() {
  slide.forEach(function(slide) {
    slide.style.transform = `translateX(${index * (-100)}%)`;
  });
}