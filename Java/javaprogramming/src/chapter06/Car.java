package chapter06;

public class Car { // 메인함수는 시작점에 하나 
	
	// 기본변수는 자동으로 초기화 됨
	boolean powerOn;// 시동
	String color;	// 차량의 색상
	int wheel;		// 바퀴의 수
	int speed;		// 속력
	boolean wiperOn;// 와이퍼
	
	void power() {powerOn = !powerOn;}	// 시동 메서드
	void speedUp() {speed++;}			// 액셀 메서드
	void speedDown() {speed--;}			// 브레이크 메서드
	void wiper() {wiperOn = !wiperOn;}	// 와이퍼 메서드

}
