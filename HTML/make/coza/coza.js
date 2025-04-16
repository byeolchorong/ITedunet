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