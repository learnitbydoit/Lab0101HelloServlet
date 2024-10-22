package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Khởi tạo servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("Bắt đầu sử dụng dịch vụ servlet");
		System.out.println("Phương thức đang sử dụng là " + req + " "+ resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Kết thúc servlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		writer.println("<H1>Hello Servlet</H1>");
		writer.close();
		
	}
}
