package chapter06;

public class exam32 {

	public static void main(String[] args) {
		// 데이터 타입 (Car) 검정색 : 주소 담음
		// 기본변수는 자동으로 초기화 됨
		// mycar(지역변수: 메서드의 자식)는 메인함수 안에서만 사용가능
		Car mycar = new Car();
		System.out.println("시동 처음 초기화 : " + mycar.powerOn); 		// false
		System.out.println("차의 색상 초기화 : " + mycar.color);			// null : 참조변수의 주소가 없다
		System.out.println("바퀴의 수 : " + mycar.wheel);				// 0
		System.out.println("속력 초기화 : " + mycar.speed);				// 0
		System.out.println("와이퍼 작동  초기화 : " + mycar.wiperOn);		// false
		
		mycar.power();	// 시동 메서드 실행 
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);		// true
		mycar.power();
		System.out.println("시동 메서드 다시 동작 : " + mycar.powerOn);	// false
		
		mycar.color = "black";	// 색상 변수에 black 대입
		System.out.println("현재 차의 색상 : " + mycar.color);			// black
	}

}
