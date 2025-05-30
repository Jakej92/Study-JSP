package com.app.controller.admin;

import java.io.IOException;
import java.util.Optional;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.AdminVO;
import com.app.repository.admin.AdminDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class JoinOkController implements Action {
	
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    Result result = new Result();
	    AdminDAO adminDAO = new AdminDAO();
	    AdminVO adminVO = new AdminVO();
	    HttpSession session = req.getSession();
	    String path = "/join.admin";
	    boolean accountFlag = false;

	    String adminAccount = req.getParameter("adminAccount");
	    String adminPassword = req.getParameter("adminPassword");
	    String adminName = req.getParameter("adminName");
	    String adminPhone = req.getParameter("adminPhone");
	    String adminEmail = req.getParameter("adminEmail");

	    adminVO.setAdminAccount(adminAccount);
	    adminVO.setAdminPassword(adminPassword);
	    adminVO.setAdminName(adminName);
	    adminVO.setAdminPhone(adminPhone);
	    adminVO.setAdminEmail(adminEmail);

	    Optional<AdminVO> foundAdmin = adminDAO.selectByAdminAccount(adminAccount);
	    if (foundAdmin.isPresent()) {
	        path += "?account=false";
	        accountFlag = true;
	    }

	    if (!accountFlag) {
	        adminDAO.insert(adminVO);
	        session.setAttribute("admin", adminVO); 
	        path = "/login.admin"; 
	    }
	    result.setPath(path);
	    return result;
	}

}