package com.app.ex.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex03 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("ex03.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fruit = req.getParameter("fruit-name");
		String price = req.getParameter("fruit-price");
		String result = fruit + "의 가격은 " + price + "원 입니다.";
		req.setAttribute("result", result);
		
		req.getRequestDispatcher("ex03-result.jsp").forward(req, resp);
	}
}
