package chapter15;

import java.io.*;
import java.net.*;

public class exam111 {

	public static void main(String[] args) {
		try {
			String serverIp = "127.16.1.60";
			System.out.println("서버에 연결을 시도하는중...");
			
			Socket socket = new Socket(serverIp,8000);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
