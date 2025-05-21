package chapter09;

import chapter05.sort;

public class exam63 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		
		try {
			System.out.println("외부로 접속");
			int c = b/a;
		} catch (ArithmeticException e) {
			System.out.println("오류가 발생했습니다.");
		} finally {
			System.out.println("무조건 연결 해제");
		}
	}

}
