package com.app.controller.member;

import java.io.IOException;

import com.app.Action;
import com.app.Result;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController implements Action {
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result(); // 결과 데이터를 저장할 Result 객체 생성
		
		// "login"이라는 요청 파라미터가 존재하는 경우
		if (req.getParameter("login") != null) {
//			로그인에 실패하면 다음 경로를 이동해주기위해 false로 값을 넣어줌
			req.setAttribute("login", false); 
		}

		// 로그인 페이지 경로 설정
		result.setPath("/templates/member/login.jsp");

		// forward 방식으로 이동 (현재 요청과 응답을 유지하면서 로그인 페이지로 이동)
		result.setForward(true);

		// 처리 결과 반환
		return result;
	}
}





















