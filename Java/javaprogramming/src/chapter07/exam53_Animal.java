package chapter07;

public class exam53_Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion1 extends exam53_Animal {
	public String toString() {
		return "사자";
	}
}

class Rabbit1 extends exam53_Animal {
	public String toString() {
		return "토끼";
	}
}

class Monkey1 extends exam53_Animal {
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper1 {
	void feed(exam53_Animal animal) {
		System.out.println(animal + "에게 먹이주기");
	}
}