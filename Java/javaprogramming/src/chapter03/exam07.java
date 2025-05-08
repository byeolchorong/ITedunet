package chapter03;

public class exam07 {

	public static void main(String[] args) {
		
		int a = 1;
		System.out.println(a);		// 1	// 현재 a는 1
		
		a++;
		System.out.println(a);		// 2	// 증가되었으므로 2
		System.out.println(++a);	// 3	// 증가시킨 다음에 출력했으므로 3
		System.out.println(a++);	// 3	// 먼저 3을 출력한 다음에 1증가
		System.out.println(a);		// 4	// 현재 a는 4
		
	}

}
