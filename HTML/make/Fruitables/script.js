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