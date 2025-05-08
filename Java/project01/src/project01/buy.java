package project01;

import java.util.Scanner;

public class buy {
	public void choice() {
		repository repository = new repository(); 
		String name = null;
		int price = 0;
		int option = 0;
		String color = null;
		
		Scanner sc = new Scanner(System.in);
		Scanner scch = new Scanner(System.in);
		
			while(true) {
			System.out.println("자동차 선택");
			System.out.println("1. 소나타");
			System.out.println("2. 벤츠");
			System.out.print("원하는 서비스 입력 : ");
			int choicecar = sc.nextInt();
			if(choicecar == 1) {
				name = "소나타";
				price = 3000;
			}
			else if (choicecar == 2) {
				name = "벤츠";
				price = 5000;
			}
			else {
				continue;
			}
			
			System.out.println("옵션 선택");
			System.out.println("1. 기본옵션");
			System.out.println("2. 풀옵션");
			System.out.print("원하는 서비스 입력 : ");
			int choiceoption = sc.nextInt();
			if(choicecar == 1) {
				price += 1000; 
			}
			else if (choicecar == 2) {
				price += 2000;
			}
			else {
				continue;
			}
			
			System.out.println("색상 선택");
			System.out.println("1. 검정색");
			System.out.println("2. 흰색");
			System.out.print("원하는 서비스 입력 : ");
			int choicecolor = sc.nextInt();
			if(choicecar == 1) {
				color = "black";
			}
			else if (choicecar == 2) {
				color = "white";
			}
			else {
				continue;
			}
			
			System.out.print("구매자 이름을 입력해주세요 : ");
			String user = scch.nextLine();
			System.out.print("구매자 연락처를 입력해주세요 -제외 : ");
			String phone = scch.nextLine();
			
			car makecar = new car(name,price,color,user,phone);
			repository repo = new repository();
			// add : 특정 객체(클래스)의 주소를 저장하는 함수
			repository.repo.add(makecar);
			break;
			}
	}
}
