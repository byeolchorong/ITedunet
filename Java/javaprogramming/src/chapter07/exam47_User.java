package chapter07;

public class exam47_User {
	private String name;
	private int age;
	exam47_User (String name, int age) { // 매개변수를 가진 생성자 
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
