package Controller;

import java.io.IOException;

import dao.member_repository;
import dto.member;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class create_controller extends HttpServlet {

	member_repository repository = member_repository.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create get");
		RequestDispatcher ds = req.getRequestDispatcher("createForm.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create post");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		member mb = new member();
		mb.setId(id);
		mb.setPw(pw);
		
		repository.save(mb);
		
		resp.sendRedirect("read_all");
	}

}
