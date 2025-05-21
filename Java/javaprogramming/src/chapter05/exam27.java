package chapter05;

import java.util.Arrays;

public class exam27 {

	public static void main(String[] args) {
		// 길이가 5인 배열 생성, 배열 길이 생략
		int[]a = new int[] { 10, 20, 4, 25, 18 };
		
		// 길이가 7인 배열 생성, new int[] 생략가능
		int[]b = { 1, 2, 3, 4, 5, 6, 7 };
		
		// for문으로 배열 초기화
		int[]c = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		// for문을 이용한 출력
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}
		System.out.println("");
		System.out.println(Arrays.toString(c));
		// Arrays.toString.() 메서드 사용
	}

}
