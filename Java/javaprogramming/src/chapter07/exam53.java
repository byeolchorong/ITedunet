package chapter07;

public class exam53 {

	public static void main(String[] args) {
		exam53_Animal lion1 = new Lion1();
		ZooKeeper1 james = new ZooKeeper1();
		james.feed(lion1);
		exam53_Animal rabbit1 = new Rabbit1();
		james.feed(rabbit1);
		exam53_Animal monkey1 = new Monkey1();
		james.feed(monkey1);
	}

}
