package chapter08;

class OuterClass1 {
	void a() {
		System.out.println("method a");
	}
	void b () {
		System.out.println("method b");
	}
}

public class exam58 {

	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a () {
				System.out.println("새롭게 정의한 익명 클래스의 메서드입니다");
			}
			
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		ok.a();
	}

}
