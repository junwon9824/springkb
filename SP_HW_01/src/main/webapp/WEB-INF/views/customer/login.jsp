<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹게시판 목록</title>
</head>
<body>
	<h1>Login</h1>


	이메일
	<input type="text" name="email">
	<br> 비밀번호
	<input type="text" name="password">
	<hr>

	<input type="submit" value="로그인"
		onclick="location.href='customer/personal'">

	<input type="submit" value="회원 가입"
		onclick="location.href='customer/Register'">


</body>
</html>
