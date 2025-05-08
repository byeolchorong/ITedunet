package chapter05;

public class exam26 {

	public static void main(String[] args) {
		int[] student = new int[3]; // 길이가 3인 배열 생성
		System.out.println("현재 자동으로 초기화 된 값 : " + student[0]);
		
		student[0]=30; // 배열의 첫번째 요소에 30을 저장
		student[1]=20; // 배열의 두번째 요소에 20을 저장
		student[2]=10; // 배열의 세번째 요소에 10을 저장
		
		System.out.println("현재 첫번째 요소의 값 = " + student[0]);
		System.out.println("현재 첫번째 요소의 값 = " + student[1]);
		System.out.println("현재 첫번째 요소의 값 = " + student[2]);
	}

}
