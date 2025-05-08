package chapter05;

public class exam28 {

	public static void main(String[] args) {
		// 시험점수의 평균 구하기
		int[] student = { 100, 95, 90, 88, 93 };
		int sum = 0;
		for (int i = 0; i<student.length; i++) {
			sum += student[i];
		}
		// 둘 중 한곳에 float으로 형변환 해주면 실수값으로 나온당~ 
		System.out.println("시험점수의 평균 : " + sum/(float)student.length);
		// System.out.println("시험점수의 평균 : " + (float)sum/student.length);
	}

}
