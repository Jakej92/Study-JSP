package com.app.controller.member;

import java.io.IOException;
import java.util.Optional;

import com.app.Action;
import com.app.Result;
import com.app.domain.vo.MemberVO;
import com.app.exception.LoginFailException;
import com.app.repository.member.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//	로그인에 성공했을시 실행될 클래스
public class LoginOkController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result(); // 결과 데이터를 저장할 Result 객체 생성
		// 클라이언트의 기존 세션을 가져오거나, 없으면 새로운 세션을 생성하여 session 변수에 저장
		HttpSession session = req.getSession(); 
		MemberDAO memberDAO = new MemberDAO(); 
		MemberVO memberVO = new MemberVO(); // 결과 데이터를 저장할 MemberVO를 객체로 생성
		MemberVO member = null; // 결과 데이터를 저장할 MemberVO를 객체로 생성하고 값을 null로 초기화
		String path = null; // 로그인 이후의 경로를 담아줄 path를 생성
		
		// 이름이 memberEmail인 인풋에 넣은 값을 가져와 memberEmail에 저장
		String memberEmail = req.getParameter("memberEmail"); 
		String memberPassword = req.getParameter("memberPassword");
		// 인풋에 넣은값을 저장한 객체를 MemberVO객체의 setter를 사용해 값을 설정해줌
		memberVO.setMemberEmail(memberEmail);
		memberVO.setMemberPassword(memberPassword);
//	 	Optional객체인 MemberVO를 foundMember라 선언 후
//		MemberDAO의 메서드에 위에 설정한 값을 넣고 사용.
		Optional<MemberVO> foundMember = memberDAO.selectByMemberEmailAndMemberPassword(memberVO);
//		try, catch로 예외 처리
		try {  // MemberVO 객체인 member에 로그인 정보를 담고있는 foundmember를 orElseThrow로 예외처리
			member = foundMember.orElseThrow(() -> {throw new LoginFailException();});
//			Exception이 나지 않는다면 member를 member라는 이름에 담고 session에 저장해줌
			session.setAttribute("member", member);
//			다음 경로 설정
			path = "/mypage.member";
//			만약 로그인실패익셉션이 난다면
		} catch (LoginFailException e) {
			System.out.println("로그인 실패"); // 로그인실패를 출력해주고
//			로그인 화면이지만 알아보기 쉽게 login false를 경로에 추가해줌
			path = "/login.member?login=false";  
		}
//		result에 경로를 설정해주고
		result.setPath(path);
//		result 리턴
		return result;
	}
}
