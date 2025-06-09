package Controller;

import java.io.IOException;

import DAO.memberRepository;
import DTO.member;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class create_controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create doget");
		// 전처리 : 없음
		// 모델이동 : 넣을 데이터도 가져올 데이터도 없음
		// 뷰이동
		RequestDispatcher ds = req.getRequestDispatcher("form.jsp");
		ds.forward(req, resp);	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create dopost");
		// 전처리
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		// 전처리 : 묶음
		member mb = new member(id,password,name); // 전체생성자를 만들었기 때문에 member mb = new member(id,password,name); 이렇게도 가능하고 member mb = new member(); 이렇게도 가능
		System.out.println(mb.toString());
		
		// 모델이동
		memberRepository repository = new memberRepository();
		repository.create(mb);
		// 뷰이동
		resp.sendRedirect("readall");
	}

}
