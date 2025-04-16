// Step1. 셀렉터
// 좌우 라벹에 클래스 .left 와 .right를 먼저 할당한다. 
let left = document.querySelector(".left");
let right = document.querySelector(".right");
// 동작이 잘 되는지 확인해보는중
console.log(left);
console.log(right);

// 슬라이드묶음 lis 변수 설정
let lis = document.querySelectorAll(".slide");
// 동작이 잘 되는지 확인해보는중
console.log(lis);

// Step.2 이벤트 할당하기 
left.addEventListener("click", leftsliding);
right.addEventListener("click", rightsliding);

// 전역변수 선언
let index = 0;
// 콘텐츠 0번째 화면에 보여질 경우, translateX(0%);
// 콘텐츠 1번째 화면에 보여질 경우, translateX(-100%);
// 콘텐츠 2번째 화면에 보여질 경우, translateX(-200%);
// 콘텐츠 3번째 화면에 보여질 경우, translateX(-300%);
// .... n번째 화면에 보여질 경우, translateX(index * (-100)%);


// Step3. 함수 선언
function leftsliding() {
  index--;
  console.log(lis.length);
  if (index < 0) {
    index = (lis.length -1);
  }
  console.log("왼쪽슬라이딩함수");
  console.log(index);
  lis.forEach(function (slide) {
    slide.style.transform = `translateX(${index * (-100)}%)`;
  });
}

function rightsliding() {
  index++;
  if (index >= (lis.length)) {
    index = 0;
  }
  console.log("오른쪽슬라이딩");
  console.log(index);
  lis.forEach(function (slide) {
    slide.style.transform = `translateX(${(index * -100)}%)`;
  });
}