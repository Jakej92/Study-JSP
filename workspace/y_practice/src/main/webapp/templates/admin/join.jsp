<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 등록</title>
</head>
<body>
	
	<h1>관리자 등록</h1>
	
	 
	
	<form action="/join-ok.admin" method="post" name="admin-form">
		<div>
			<input type="text" name="adminAccount" placeholder="아이디 입력">
		</div>
		<%
        String account = request.getParameter("account");
        if ("false".equals(account)) {
    		{%>
        <p style="color: red;">❌ 이미 존재하는 계정입니다. 다른 아이디를 사용해주세요.</p>
    		<%}
        }
    	%>
		<div>
			<input type="password" name="adminPassword" placeholder="비밀번호 입력">
		</div>
		<div>
			<input type="text" name="adminName" placeholder="이름 입력">
		</div>
		<div>
			<input type="text" name="adminPhone" placeholder="전화번호 입력">
		</div>
		<div>
			<input type="text" name="adminEmail" placeholder="이메일 입력">
		</div>
		<div>
			<button>관리자 추가</button>
		</div>
	</form>
</body>
</html>