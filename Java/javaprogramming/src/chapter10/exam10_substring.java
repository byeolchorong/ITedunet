package chapter10;

public class exam10_substring {

	public static void main(String[] args) {
		String a = "012345678"; // 인덱스는 0부터 시작합니다. 
		String b = a.substring(4,8); // 4번째부터 8번째 전까지 잘라준다.
		System.out.println(b);
	}

}
