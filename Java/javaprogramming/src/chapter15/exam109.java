package chapter15;

import java.net.*;

public class exam109 {

	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("");
		try {
			ip = InetAddress.getByName("www.daum.net");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("");
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("");
		try {
			ip = InetAddress.getByName("www.eieifemiofmeowfmwe.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("에러"); // 실제로 존재하지 않는 주소라 에러발생
		}
		
	}

}
