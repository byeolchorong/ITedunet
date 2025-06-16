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

@WebServlet("/update")
public class update_controller extends HttpServlet  {

	member_repository repository = member_repository.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("update get");
		String id = req.getParameter("id");
		member mb = repository.readone(id);
		req.setAttribute("member", mb);
		RequestDispatcher ds = req.getRequestDispatcher("updateForm.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
