package chapter04;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		
		while(true) 
		{
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");
			i = sc.nextInt(); // 정수 입력받아서 i에 저장
			if (i == 0) 
			{ // 만약 0을 입력하였다면 종료
				break;
			}
			sum += i; // 입력받은 값 더해주기
		}
		System.out.println("현재까지의 총합 = " + sum);
	}

}
