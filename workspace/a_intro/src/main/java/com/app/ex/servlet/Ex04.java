package com.app.ex.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("ex04.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String city = req.getParameter("city");
		
//		redirect방식
		resp.sendRedirect(city.equals("서울") ? "ex04-gang" : "ex04-nam");
		
//		req.setAttribute("address", city.equals("경기도") ? "남양주시" : "강남구");
//		req.getRequestDispatcher("ex04-result.jsp").forward(req, resp);
	}
}




