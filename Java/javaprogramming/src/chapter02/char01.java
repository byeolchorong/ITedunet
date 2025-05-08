package chapter02;

public class char01 {

	public static void main(String[] args) 
	{
		
		// char에 대한 연구
		// char은 숫자도 문자도 되는 마법의 변수
		
		// Step 1. char에 데이터를 넣기
		char a = 'A';	// 출력시 'A'
		char b = 65;	// 출력시 'A'
		
		int c = 'A';	// 데이터가 자동으로 형변환이 이루어짐
		
		// int 변수 -> char 변수 (x)
		// a = c;
		// char 변수 -> int 변수 (o)
		c = a;
		
		System.out.println(a);	// A
		System.out.println(b);	// A
		System.out.println(c);	// 65
		
	}

}
