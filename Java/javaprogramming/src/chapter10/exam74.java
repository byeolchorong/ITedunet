package chapter10;

import java.util.Random;

public class exam74 {

	public static void main(String[] args) {
		Random random = new Random();
		Random random2 = new Random(2);
		Random random3 = new Random(2);
		for (int i =0; i < 5; i++) {
			System.out.println("기본 생성자 : " + random.nextInt());
		}
		System.out.println("");
		
		for (int i =0; i < 5; i++) {
			System.out.println("random2 : " + i + "번째 값" + random2.nextInt());
		}
		System.out.println("");
		
		for (int i =0; i < 5; i++) {
			System.out.println("random2 : " + i + "번째 값" + random2.nextInt());
		}
		System.out.println("");
		
		int a = random.nextInt(11)+20; // 20~30 // 11개
		System.out.println(a);
		int b = random.nextInt(100)+100; // 100 ~ 199 // 100개
		System.out.println(b);
		
	}

}
