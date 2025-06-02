package chapter13;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/exam13_1")
public class session01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("exam13_1 실행중");
		RequestDispatcher ds = req.getRequestDispatcher("chapter13/session01.jsp");
		ds.forward(req, resp);	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		if ("admin".equals(id)&& pw.equals("1234")) {
			// 로그인 성공 로직
			//             true  : 없으면 새로만들고 있으면 그냥 그거 줘!
			//             false : 없으면 null을 주고 있으면 그냥 그거 줘! 
			 HttpSession session = req.getSession(true);
			 session.setAttribute("id", id);
			 session.setAttribute("pw", pw);
		}
		
		RequestDispatcher ds = req.getRequestDispatcher("chapter13/session01_process.jsp");
		ds.forward(req, resp);	
	}

}
