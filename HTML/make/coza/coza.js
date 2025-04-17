// headerTop높이를 얻어서 headerBottom의 top 속성의 값을 바꿔줄 에정
// position:absolute -> position : fixed 로 바꿔줄 예정
let headerTop = document.querySelector('.wrap-top-left');
let headerBottom = document.querySelector('.wrap-top-right');
let offset = headerTop.offsetHeight;

window.addEventListener('scroll', function() {
  if (this.window.scrollY > offset) {
    headerBottom.classList.add('scrolled');
    headerBottom.style.top = 0;
  } else {
    headerBottom.classList.remove('scrolled');
    headerBottom.style.top = offset+"px";
  }
});

// tab 
// Step1. 요소 선택하기
let tabs = document.querySelectorAll('.view-nav-left li');
let contents = document.querySelectorAll('.overview-img');
console.log(tabs);
console.log(contents);

// Step2. 이벤트 할당하기 
for (let i = 0; i < tabs.length; i++) {
  tabs[i].addEventListener('click', tabIdCalculator);
}

// Step3. 함수 선언하기
function tabIdCalculator() {
  let tabId = this.id;
  console.log("tabId : " + tabId);

  showTabContent(tabId);
}

//클릭 이벤트가 발생한 버튼과 관련된 콘텐츠 나타내기
//this와의 관련성 : 교집합 만들어주기
function showTabContent(tabId) {
  for (let i = 0; i < contents.length; i++) {
    contents[i].classList.remove('active');
  }

  let activeContent = document.querySelectorAll("." + tabId);
  console.log("tabId", tabId);

  if (activeContent) {
    for (let i = 0; i < activeContent.length; i++) {
      activeContent[i].classList.add('active');
    }
  }
}



// slide
// step1. selector
// 좌우 icon에 클래스 .left .right 먼저 할당하기! 
let left = document.querySelector(".left");
let right = document.querySelector(".right");
console.log(left);
console.log(right);

let lis = document.querySelectorAll('.slide');
console.log(lis);

left.addEventListener("click",leftsliding);
right.addEventListener("click",rightsliding);

let index = 0;

function leftsliding() {
  index--;
  // 음수값이되면 안되므로 li의 갯수 값을 넣어줌 현재는 2
  console.log(lis.length);
  if (index < 0) {
      index = (lis.length - 1); //2을 입력
  }
  console.log("왼쪽 슬라이딩함수");
  console.log(index);
  lis.forEach(function (slide) {
      slide.style.transform = `translateX(${index * (-100)}%)`;
  });  
}
function rightsliding() {
  index++;
  // 마지막 슬라이더 번호보다 크면 안됨
  if (index >= (lis.length)) {
      index = 0; 
  }
  console.log("오른쪽 슬라이딩함수");
  console.log(index);
  lis.forEach(function (slide) {
      slide.style.transform = `translateX(${index * (-100)}%)`;
  }); 
}