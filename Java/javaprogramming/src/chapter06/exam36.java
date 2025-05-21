package chapter06;

public class exam36 {

	public static void main(String[] args) {
		Area.manual();			// 클래스 메서드 접근 가능
		// Area.triangle(3,5) 	// 에러발생
		// Area.ractangle(3,4)	// 에러발생
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3,5));
		System.out.println(cal.rectangle(3,4));
	}

}
