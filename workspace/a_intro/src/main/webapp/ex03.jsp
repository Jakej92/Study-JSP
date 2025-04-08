<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX03</title>
</head>
<body>
	<form action="ex03" method="post" name="fruit-form">
		<input type="text" name="fruit-name" placeholder="과일 이름">
		<input type="text" name="fruit-price" placeholder="과일 가격">
		<input type="button" value="완료">
	</form>
</body>
<script>
	const name = document.querySelector("input[name=fruit-name]");
	const price = document.querySelector("input[name=fruit-price]");
	const button = document.querySelector("input[type=button]");
	
	button.addEventListener("click", (e) => {
		if(!name.value) {
			alert("값을 입력해주세요.");
			number1.focus();
			return;
		}
		if(!price.value) {
			alert("값을 입력해주세요.");
			number2.focus();
			return;
		}
		
		document["fruit-form"].submit();
	});
</script>
</html>