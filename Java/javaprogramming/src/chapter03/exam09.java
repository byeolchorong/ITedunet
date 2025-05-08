package chapter03;

public class exam09 {

	public static void main(String[] args) {
		
		double a = 3.14;
		double b = 5.14;
		System.out.println(a == b);	// false
		System.out.println(a != b);	// true
		
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true
		
	}

}
