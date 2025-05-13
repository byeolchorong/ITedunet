package chapter07;

public class exam52_Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion3 extends exam52_Animal {
	public String toString() {
		return "사자";
	}
}

class Rabbit extends exam52_Animal {
	public String toString() {
		return "토끼";
	}
}

class Monkey extends exam52_Animal {
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper3 {
	void feed (Lion3 lion) {
		System.out.println(lion + "에게 먹이주기");
	}
	void feed (Rabbit rabbit) {
		System.out.println(rabbit + "에게 먹이주기");
	}
	void feed (Monkey monkey) {
		System.out.println(monkey + "에게 먹이주기");
	}
}