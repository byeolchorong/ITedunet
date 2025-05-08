package project01;

import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		buy by = new buy();
		search sr = new search();
		while(true) {
			
			System.out.println("자동차 구매 프로그램 명탐정코난입니다.");
			System.out.println("원하는 서비스를 선택해주십시요.");
			System.out.println("1. 구매");
			System.out.println("2. 회원 조회");
			System.out.println("3. 전체 구매이력 조회");
			System.out.println("0. EXIT");
			
			System.out.print("원하는 서비스 입력 : ");
			int choice = sc .nextInt();
			
			if (choice == 0) {break;}
			
			switch(choice) {
				case 1 : 
					System.out.println("구매를 선택하셨습니다.");
					by.choice();
					break;
				case 2 : 
					System.out.println("회원조회를 선택하셨습니다.");
					break;
				case 3 : 
					System.out.println("전체 구매이력 조회를 선택하셨습니다.");
					sr.allsearch();
					break;
				default :	
					continue;
				
			}
		}
	}

}
