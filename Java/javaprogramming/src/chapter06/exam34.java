package chapter06;

public class exam34 {

	public static void main(String[] args) {
		System.out.println(Cars.wheel);	// 클래스 변수 접근 가능	// 4
		//System.out.println(Cars.speed);// 에러발생! 인스턴스 변수 접근 

		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);	// 4
		System.out.println(myCar1.speed); // 인스턴스 생성 후에는 접근 가능	// 0
		
		Cars myCar2 = new Cars();
		
		System.out.println("\n<변경 전>");
		System.out.println("myCar1.speed : " + myCar1.speed) ;	// 0
		System.out.println("myCar2.speed : " + myCar1.speed) ;	// 0
		System.out.println("myCar1.wheel : " + myCar1.wheel) ;	// 4
		System.out.println("myCar2.wheel : " + myCar2.wheel) ;	// 4
		
		myCar2.speed = 100;
		myCar2.wheel = 5;
		
		System.out.println("\n<변경 후>");
		System.out.println("myCar1.speed : " + myCar1.speed) ;	// 0
		System.out.println("myCar2.speed : " + myCar2.speed) ;	// 100
		System.out.println("myCar1.wheel : " + myCar1.wheel) ;	// 5
		System.out.println("myCar2.wheel : " + myCar2.wheel) ;	// 5
		
	}

}
