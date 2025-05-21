package chapter02;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 애노테이션이라 하고 특정객체를 자동으로 생성 NoCodeBase
// .java파일 가져오기
@WebServlet("/declaration01")
public class declaration01 extends HttpServlet{
	// get방식 입장
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("declaration01 연결되었습니다.");
		// .jsp 파일 가져오기
		RequestDispatcher ds = req.getRequestDispatcher("chapter02/declaration01.jsp");
		ds.forward(req, resp);
	}
	// post방식 입장
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
