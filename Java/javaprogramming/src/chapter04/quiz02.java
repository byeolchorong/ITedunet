package chapter04;

public class quiz02 {

	public static void main(String[] args) {
		// 구구단 만들기
		for (int i = 2; i < 10; i++) 
		{
			for (int j = 1; j < 10; j++) 
			{
				System.out.printf("%d X %d = %d \n", i, j, i * j);
				//System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
	}

}
