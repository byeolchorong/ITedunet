package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.member;

public class member_repository {
	private static member_repository repository = new member_repository();
	private member_repository() {};
	public static member_repository getInstance() {
		return repository;
	}
	
	public void save(member mb) {
		System.out.println(mb.toString());
		Connection conn = null;
		String url="jdbc:mysql://localhost:3306/test_crud";
		String id="root";
		String pw="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("데이터 베이스 연결됨");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		String sql = "insert into member values(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mb.getId());
			pstmt.setString(2, mb.getPw());
			pstmt.executeUpdate();
		} catch (Exception e) {e.printStackTrace();}
	}

}
