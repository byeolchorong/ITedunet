package chapter03;

public class quiz01 {

	public static void main(String[] args) {
		// 문제 1  
		// a = 5, b = 10, c = 15 일 때, !(a > b) && (b < c || a + b == 15)의 결과는 무엇인가요? 
		// 1 x (1 + 1) : true
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println(!(a > b) && (b < c || a + b == 15));
		
		// 문제 2 
		// x = 25, y = 30, z = 20 일 때, (x >= y && y < z) || (z < x && x > 10)의 결과는 무엇인가요?
		// (0 x 0) + (1 x 1) : true
		int x = 25;
		int y = 30;
		int z = 20;
		System.out.println((x >= y && y < z) || (z < x && x > 10));
		
		// 문제 3
		// isMember = true, hasDiscount = false, isStudent = true일 때, 
		// isMember && (hasDiscount || isStudent)의 결과는 무엇인가요?
		// 1 x ( 0 + 1 ) : true
		boolean isMember = true;
		boolean hasDiscount = false;
		boolean isStudent = true;
		System.out.println(isMember && (hasDiscount || isStudent));
		
		// 문제 4
		// score1 = 85, score2 = 90, score = 75일 때, ((score1 > 80 && score2 > 80) || score3 < 80) && (score1 + score2 + score3 > 250)의 결과는 무엇인가요?
		// ((1 x 1) + 1) x (0) : false
		int score1 = 85;
		int score2 = 90;
		int score3 = 75;
		System.out.println(((score1 > 80 && score2 > 80) || score3 < 80) && (score1 + score2 + score3 > 250));
		
		// 문제 5
		// temperature = 30, isSunny = true, isHoliday = false일 때, (temperature > 25 && isSunny) || (temperature <= 25 && isHoliday)의 결과는 무엇인가요?
		// (1 x 1) + (0 x 0) : true
		int temperature = 30;
		boolean isSunny = true;
		boolean isHoliday = false;
		System.out.println((temperature > 25 && isSunny) || (temperature <= 25 && isHoliday));
		
		// 문제 6
		// num1 = 12, num2 = 8, num3 = 4일 때, !(num1 % 2 == 0) && (num2 > num3 || num1 == num3)의 결과는 무엇인가요?
		// 0 x (1 + 0) : false 
		int num1 = 12;
		int num2 = 8;
		int num3 = 4;
		System.out.println(!(num1 % 2 == 0) && (num2 > num3 || num1 == num3));
		
		// 문제 7
		// isOpen = false, hasKey = true, isGuest = false일 때, isOpen || (hasKey && !isGuest)의 결과는 무엇인가요?
		// 0 + (1 + 1) : true
		boolean isOpen = false;
		boolean hasKey = true;
		boolean isGuest = false;
		System.out.println(isOpen || (hasKey && !isGuest));
		// 문제 8
		// age = 25, isEmployed = true, hasDegree = false일 때, (age >= 18 && isEmployed) || (hasDegree && age < 30)의 결과는 무엇인가요?
		// (1 x 1) + (0 x 1) : true
		int age = 25;
		boolean isEmployed = true;
		boolean hasDegree = false;
		System.out.println((age >= 18 && isEmployed) || (hasDegree && age < 30));
		
		// 문제 9
		// input = "java", isLearning = true, isFun = false일 때, !(input.equals("python") && isLearning) || isFun의 결과는 무엇인가요?
		// (1 x 1) + 0 : true
		String input = "java";
		boolean isLearning = true;
		boolean isFun = false;
		System.out.println(!(input.equals("python") && isLearning) || isFun);
		
		// 문제 10
		// a = 10, b = 20, c = 5일 때, ((a + b > c && b - c < a) || (c == 5)) && (a * c > b)의 결과는 무엇인가요?
		// ((1 x 0) + 1) x 1 : true
		a = 10;
		b = 20;
		c = 5;
		System.out.println(((a + b > c && b - c < a) || (c == 5)) && (a * c > b));
	}

}
