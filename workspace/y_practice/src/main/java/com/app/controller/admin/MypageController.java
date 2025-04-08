package com.app.controller.admin;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.AdminVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MypageController implements Action {
 
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		HttpSession session = req.getSession();
		AdminVO admin = (AdminVO)session.getAttribute("admin");
		req.setAttribute("admin", admin);
		
		result.setPath("templates/admin/mypage.jsp");
		result.setForward(true);
		return result;
	}
}
