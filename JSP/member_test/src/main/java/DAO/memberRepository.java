package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.member;

public class memberRepository {
	// 선언하기
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	// DB연결함수
	public Connection dbconn() throws Exception {
		String url = "jdbc:mysql://localhost:3306/membertest";
		String id = "root";
		String pw = "1234";
		// WEB-INF>lib폴더에 라이브러리 확보확인
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		return conn;
	}
	
	// create
	public void create(member mb) {
		System.out.println("repository : create 함수입장");
		System.out.println(mb.toString());
		String sql = "insert into member values(?,?,?)";
		try {
			conn=dbconn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mb.getId());
			pstmt.setString(2, mb.getPassword());
			pstmt.setString(3, mb.getName());
			pstmt.executeUpdate();
		} catch (Exception e) { e.printStackTrace(); }
	}
	// update
	public void update (member mb) {
		System.out.println("repository : update 함수입장");
		String sql = "update member set password=?, name=? where id = ?";
		try {
			conn = dbconn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mb.getPassword());
			pstmt.setString(2, mb.getName());
			pstmt.setString(3, mb.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {}
	}
	
	
	// delete
	public void delete(String id) {
	    try {
	        conn = dbconn();
	        String sql = "delete from member where id = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, id);
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// read 리턴해야됨 전체
	public ArrayList readall() {
		// DB연결
		ArrayList memberset = null;
		try {
			conn = dbconn();
			// 쿼리전송
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			memberset = new ArrayList();
			while(rs.next()) {
				member mb = new member();
				mb.setId(rs.getString("id"));
				mb.setPassword(rs.getString("password"));
				mb.setName(rs.getString("name"));
				memberset.add(mb);
			}
		} catch (Exception e) {}
		return memberset;
	
	}
	public member readone(String id) {
		member mb = null;
		try {
			conn = dbconn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mb = new member();
				mb.setId(rs.getString("id"));
				mb.setPassword(rs.getString("password"));
				mb.setName(rs.getString("name"));
			}
		} catch (Exception e) {}
		return mb;
	}
	
}
