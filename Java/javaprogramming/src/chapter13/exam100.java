package chapter13;

import java.io.*;

public class exam100 {

	public static void main(String[] args) throws IOException {
		// 데이터 수신 
		FileInputStream fis = null;
		fis = new FileInputStream ("prac.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 데이터 출력
		FileOutputStream fos = null;
		fos = new FileOutputStream("result.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while ((data = bis.read())!= -1) {
			System.out.println(data);
			bos.write(data);
		}
		bos.close();	// 사용한 스트림은 닫아주기 // 안닫으면 에러남! 
		bis.close();	// 사용한 스트림은 닫아주기 // 안닫으면 에러남! 
	}

}
