package chapter07;

public class exam52 {

	public static void main(String[] args) {
		Lion3 lion1 = new Lion3();
		ZooKeeper3 james = new ZooKeeper3();
		james.feed(lion1);
		
		Rabbit rabbit1 = new Rabbit();
		james.feed(rabbit1);
		Monkey monkey1 = new Monkey();
		james.feed(monkey1);
	}	

}
