<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 추가</title>
</head>
<body>
	<form action="/addpost-ok.post" method="post" name="add-form">
		<div>
			<input type="text" name="postTitle" placeholder="게시글 제목">
		</div>
		<div>
			<input type="text" name="postContent" placeholder="게시글 내용">
		</div>
		<div>
			<button>게시글 등록</button>
		</div>
	</form>
</body>
</html>