package chapter08;

abstract class Pokemon {
	String name;
	
	abstract void attack();
	abstract void sound();
	
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon {
	Pikachu() {
		this.name = "피카츄";
	}

	@Override
	void attack() {
		System.out.println("전기 공격!");
	}

	@Override
	void sound() {
		System.out.println("피카 피카!!");
	}
	
}

class Squirtle extends Pokemon {
	Squirtle() {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물 공격!");
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!!");
	}
}


public class exam54 {

	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포겟몬은 : " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은 : " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}
	
}
