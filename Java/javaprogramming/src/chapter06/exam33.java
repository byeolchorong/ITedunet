package chapter06;

public class exam33 {

	public static void main(String[] args) {
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색 : " + mycar1.color);				// car 인스턴스 생성
		System.out.println("mycar2의 색 : " + mycar2.color);				// car 인스턴스 하나 더 생성
		System.out.println("mycar1의 속도 : " + mycar1.speed);			// mycar1의 색상 : 빨강
		System.out.println("mycar2의 속도 : " + mycar2.speed);			// mycar2의 색상 : 검정
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);	
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);
		
		
	}

}
