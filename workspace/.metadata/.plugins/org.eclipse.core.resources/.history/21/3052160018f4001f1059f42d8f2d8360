<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	#check {
		color: red;
	}
</style>
</head>
<body>
	<form action="/login-ok.admin" method="post" name="login-form">
		<div>
			<input type="text" name="adminAccount" placeholder="아이디 입력">
		</div>
		<div>
			<input type="password" name="adminPassword" placeholder="비밀번호 입력">
		</div>
		<%if(request.getParameter("login") != null){%>
			<div>
				<p id="check">아이디 또는 비밀번호를 다시 확인해주세요</p>
			</div>
		<%} %>
		<div>
			<button>로그인</button>
		</div>
	</form>
</body>
</html>







