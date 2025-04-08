package com.app.controller.admin;

import java.io.IOException;

import com.app.Action;
import com.app.Result;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController implements Action {

    @Override
    public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Result result = new Result();
        result.setPath("/templates/admin/login.jsp"); // ✅ 로그인 페이지로 이동!
        result.setForward(true); // ✅ Forward 방식으로 이동!
        return result;
    }
}
