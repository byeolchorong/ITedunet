package chapter07;

public class exam47 {

	public static void main(String[] args) {
		exam47_User user1 = new exam47_User("철수",20);
		exam47_User user2 = new exam47_User("영희",19);
		
		

		user2.setAge(20);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
