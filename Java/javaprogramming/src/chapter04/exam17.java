package chapter04;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		
		int age;
		Scanner input = new Scanner(System.in);
		String tmp = input.nextLine();
		age = Integer.parseInt(tmp);
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		// 19 >= age가 14-19살인 경우
		else if (age > 13) {
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		// 13 >= age가 9-13살인 경우
		else if (age > 8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이요금이 적용됩니다.");
		}
		// age가 9보다 작은 경우
		else {
			System.out.println("유아입니다.");
			System.out.println("유아요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해주세요.");
	}
}
