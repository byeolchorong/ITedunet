package chapter07;

public class exam43_SportsCar extends exam43_Car2 {
	int speedLimit;
	
	exam43_SportsCar (String color, int speedLimit) {
		// 2가지 방법
		// 1. super(); 를 쓰면 부모 클래스에 기본 생성자 exam43_Car2() { } 가 필요하다.
		super();
		// 2. super(color); 를 쓰면 부모 클래스에 매개변수 생성자 exam43_Car2(String color) 가 있어야 한다.
		// super(color);
		this.color = color;
		this.speedLimit = speedLimit;
	}
}
