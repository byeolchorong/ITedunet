package chapter07;

public class exam51_Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion2 extends exam51_Animal {
	public String toString() {
		return "사자";
	}
}


class ZooKeeper2 {
	void feed (Lion2 lion) {
		System.out.println(lion + "에게 고기 주기");
	}
}
