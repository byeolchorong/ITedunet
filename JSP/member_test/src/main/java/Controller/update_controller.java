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

@WebServlet("/update")
public class update_controller extends HttpServlet{
	
	memberRepository repository = new memberRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("update get");
		// 전처리
		String id = req.getParameter("id");
		// 모델이동
		
		// 뷰이동
		member mb = repository.readone(id);
		req.setAttribute("member", mb);
		RequestDispatcher ds = req.getRequestDispatcher("updateForm.jsp");
		ds.forward(req, resp);	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("update post");
		// 전처리
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		
		//전처리 : 묶음
		member mb = new member(id,password,name); // 전체생성자를 만들었기 때문에 member mb = new member(id,password,name); 이렇게도 가능하고 member mb = new member(); 이렇게도 가능
		System.out.println(mb.toString());
		
		// 모델이동
		repository.update(mb);
		
		// 뷰이동
		resp.sendRedirect("readall");
	}

}
