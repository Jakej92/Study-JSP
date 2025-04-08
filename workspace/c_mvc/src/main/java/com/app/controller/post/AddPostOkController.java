package com.app.controller.post;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.repository.member.MemberDAO;
import com.app.repository.member.PostDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddPostOkController implements Action {
	
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		PostVO postVO = new PostVO();
		PostDAO postDAO = new PostDAO();
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		String postTitle = req.getParameter("postTitle");
		String postContent = req.getParameter("postContent");
		
		Long memberId = member.getId();
		
		
		postVO.setPostTitle(postTitle);
		postVO.setPostContent(postContent);
		postVO.setMemberId(memberId);
		
		postDAO.insert(postVO);
		
		result.setPath("");
		
		return null;
	}
}
