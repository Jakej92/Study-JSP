package com.app.controller.member;

import java.io.IOException;
import com.app.Action;
import com.app.Result;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 회원 가입 요청을 처리하는 컨트롤러
 * Action 인터페이스를 구현하여 execute 메서드를 오버라이딩함
 */
public class JoinController implements Action {
	
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 결과 데이터를 저장할 Result 객체 생성
		Result result = new Result(); 
		
		// 요청을 처리한 후 이동할 페이지 설정
		result.setPath("/templates/post/addpost.jsp");

		// forward 방식(true)으로 페이지 이동 (false면 redirect)
		result.setForward(true);

		// 처리 결과 반환
		return result;
	}
}




















