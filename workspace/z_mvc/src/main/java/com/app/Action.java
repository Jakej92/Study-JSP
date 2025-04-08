package com.app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {
//	여러곳에서 중복해서 쓰는 메소드를 인터페이스에 추상메소드로 만들고 필요할때 가져가서 재구성해서 쓰기위함.
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
