package chapter10;

public class exam10_stringBuilder_StringBuffer{

	public static void main(String[] args) {
		String a = "java";
		String b = "Hello";
		System.out.println("a : " + a.hashCode());
		System.out.println("b : " + b.hashCode());
		
		a = a+b;
		System.out.println("a : " + a.hashCode());
		StringBuffer c = new StringBuffer();
		System.out.println("c : " + c.hashCode());
		c.append(2);
		c.append("+");
		c.append(3);
		c.append("=");
		c.append(5);
		System.out.println(c);
		c.append("TEST StringBuffer");
		System.out.println("c : " + c.hashCode());
	}

}
