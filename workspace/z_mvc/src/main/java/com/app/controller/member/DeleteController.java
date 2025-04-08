package com.app.controller.member;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.MemberVO;
import com.app.repository.member.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//	interface Action을 구현하는 DeleteController 클래스
public class DeleteController implements Action {
	@Override // Action 인터페이스에 있는 메서드를 재정의 해줌.
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result(); // 여러개의 값을 하나에 담아줄 Result 클래스를 호출
		HttpSession session = req.getSession(); // HttpSession클래스를 session으로 선언하고 req.getSession으로 값들을 불러옴
		MemberDAO memberDAO = new MemberDAO(); // MemberDAO 클래스를 사용하기위해 memberDAO로 선언
		
//		Long타입 id에 session을 getAttribute로 저장되어있는 member를 불러오고 getId로 아이디를 담아줌 
//		자료형이 달라서 MemberVO로 다운 캐스팅해줌
		Long id = ((MemberVO)session.getAttribute("member")).getId();
		memberDAO.delete(id); // memberDAO에 있는 메서드 delete에 id를 넣고 사용.
		
		result.setPath("/login.member"); // result에 setPath로 경로를 넣어주고 사용.
		return result; // result 를 반환.
	}
}



















