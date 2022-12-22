<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/notice/register" method="post">
	<div>
		<input name="NT_TITLE" type="text" placeholder="글제목을 입력해주세요.">
	
	</div>
	<div>
		<input name="NT_CONTENT" type="text" placeholder="내용을 입력해주세요.">
	</div>
	
	<div>
		<input name="NT_WRITER" type="text" placeholder="작성자">
	</div>
	
	
	<div>
		<button type="submit">글 등록</button>
	</div>
	
	</form>
	
	
	
	
</body>
</html>