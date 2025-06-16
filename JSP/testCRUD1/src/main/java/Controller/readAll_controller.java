package Controller;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

import dao.member_repository;
import dto.member;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/read_all")
public class readAll_controller extends HttpServlet{

	member_repository repository = member_repository.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("readAll get");
		//모델이동
		ArrayList<member> allmember = repository.readall();
		
		req.setAttribute("allmember", allmember);
		RequestDispatcher ds = req.getRequestDispatcher("allview");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
