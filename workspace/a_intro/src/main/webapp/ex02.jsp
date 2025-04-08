<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX02</title>
</head>
<body>
	<form action="ex02" method="post" name="calculate">
		<input type="text" name="number1" placeholder="첫 번째 정수">
		<input type="text" name="number2" placeholder="두 번째 정수">
		<button type="button">완료</button>
	</form>
</body>
<script>
	const number1 = document.querySelector("input[name=number1]");
	const number2 = document.querySelector("input[name=number2]");
	const button = document.querySelector("button[type=button]");
	
	button.addEventListener("click", (e) => {
		if(!number1.value) {
			alert("값을 입력해주세요.");
			number1.focus();
			return;
		}
		if(!number2.value) {
			alert("값을 입력해주세요.");
			number2.focus();
			return;
		}
		
		calculate.submit();
	});
</script>
</html>