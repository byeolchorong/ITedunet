package chapter07;

public class exam46_User {
	public String name ;
	public int age;
	exam46_User (String name, int age) { // 매개변수를 가진 생성자 
		this.name = name;
		this.age = age;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	public int getAge () {
		return age;
	}
	
	
}



