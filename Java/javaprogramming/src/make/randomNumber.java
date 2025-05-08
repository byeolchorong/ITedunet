package make;

import java.util.Scanner;
import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] guesses = new int[100];
		int answer = random.nextInt(100) + 1;
		int guess = 0;
		int count = 0;
		int index = 0;
		
		System.out.println("===== 숫자 맞추기 게임 =====");
		System.out.println("1부터 100사이의 숫자를 맞춰보자!");

		while (guess != answer) 
		{
			guess = scanner.nextInt();
			guesses[index] = guess;
			count++;
			index++;
			
			if (guess < answer) 
			{
				System.out.println("더 큰 수로 생각해보자 ~ ");
			} 
			else if (guess > answer) 
			{
				System.out.println("더 작은 수로 생각해보자 ~ ");
			} 
			else 
			{
				System.out.printf("정답! 숫자를 %d번만에 맞췄어! 짝짝짝👏🏻👏🏻👏🏻!!\n",count);
			}
		}
		System.out.print("너가 입력한 숫자는 ");
		for (int i =0; i < index; i++) {
			System.out.print(guesses[i] + " ");
		}
		System.out.println("이야~");
	
	}

}
