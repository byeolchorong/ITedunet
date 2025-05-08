package chapter02;

public class exam01 
{

	public static void main(String[] args) 
	{

		byte a = 127;
		int b = a;				// 자동 형변환 (byte -> int)
		System.out.println(b);	// 127
		
		float c = b;			// 자동 형변환 (int -> float) 
		System.out.println(c);	// 127.0
		
	}

}
