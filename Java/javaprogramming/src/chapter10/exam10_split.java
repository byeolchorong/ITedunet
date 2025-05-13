package chapter10;

public class exam10_split {
// 중요 
	public static void main(String[] args) {
		String a = "kor,eng,math";
		String div[] = a.split(",");
		for (int i = 0; i< div.length; i++) {
			System.out.println(div[i]);
		}
	}

}
