//1. 셀렉트하기
let pages = document.querySelector("#menuList_pages");
let subList = document.querySelector("#subList");
console.log(pages);

//2.이벤트 할당하기
pages.addEventListener("click", showSubList);

let cnt = 0; //클릭 횟수

//3. 함수 선언하기
function showSubList(){

  cnt++; 
  if(cnt % 2 == 1){ 
    // subList.style.display = "block";
    subList.classList.remove("display_none");
  }else{ 
    subList.classList.add("display_none");
  }

  console.log(cnt);
}

//Step1. 이벤트 줄 요소 선택하기
let left = document.querySelector("#main .left");
let right = document.querySelector("#main .right");
let slides = document.querySelectorAll("#main .slide");

//Step2. 이벤트 등록하기

left.addEventListener("click", leftsliding);
right.addEventListener("click", rightsliding);

let index = 0; //초기화 : 1번만 수행


//Step3. 함수 선언하기
function leftsliding(){
  index = index -1;
  if(index < 0){
    index = slides.length - 1 ;
  }
  sliding();
}

function rightsliding(){
  index++;
  if(index >= slides.length){
    index = 0;
  }
  sliding();
}

function sliding(){
  slides.forEach(function(slide){
    slide.style.transform = `translateX(${index*(-100)}%)`;
  });
}


//tab 
// Step1. 요소 선택하기
let tabs = document.querySelectorAll('.tab');
let contents = document.querySelectorAll('.tab-content');

// Step2. 이벤트 할당하기
for (let i = 0; i < tabs.length; i++) {
  tabs[i].addEventListener('click', showTabContent);
  tabs[i].addEventListener('click', activateTab);
}

/*
Step3. 함수 선언하기
Step4. 함수 구현하기 : 클릭한 메뉴와 관련된 컨텐츠 나타내기(block)
 1) 클릭한 메뉴는 this이고
 2) this와 관련된 컨텐츠 선택하여 나타내기
 2-1) this.id값과 같은 class값을 가진 요소 선택하여 변수에 담기(짝궁) 
 2-2) "모든" 컨텐츠의 style.display = "none"; 처리
 2-3) this와 관련된 컨텐츠만 style.display = "block"; 처리
*/
function showTabContent() {
  let tabClass = this.id; // 예: tab1, tab2, ...

  // 모든 콘텐츠 숨기기
  for (let i = 0; i < contents.length; i++) {
    contents[i].style.display = "none";
  }

  // 클릭한 탭의 id와 같은 class를 가진 모든 콘텐츠 보여주기
  for (let i = 0; i < contents.length; i++) {
    if (contents[i].classList.contains(tabClass)) {
      contents[i].style.display = "block";
    }
  }
}

/*
Step3. 함수 선언하기
Step4. 함수 구현하기 : 클릭한 메뉴 본인(this)의 배경색상 바꾸기
 1) "모든" 탭메뉴의 style.backgroundColor = "지정하려는 기본색상";
 2) 클릭한 본인(this)의 style.backgroundColor = "기본색상과 차이나는 색상";
*/
function activateTab() { 
  for (let i = 0; i < tabs.length; i++) {
    tabs[i].style.backgroundColor = "#f1f1f1";
    tabs[i].style.color = "#020202";
  }
  this.style.backgroundColor = "#ffc107";
  this.style.color = "#ffffff";
}