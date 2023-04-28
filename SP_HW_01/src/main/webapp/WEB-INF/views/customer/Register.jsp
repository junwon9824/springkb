<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Register</title>
</head>
<body>

	<h1>Register</h1>
	<form action="Register" method="post">
		이름 <input type="text" name="name"><br> 이메일 <input
			type="text" name="email"><br> 연락처 <input type="text"
			name="tel"><br> 비밀번호 <input type="password"
			name="password"> 비밀번호 <input type="password" name="password2">

		<hr>
		<input type="submit" value="회원가입">
	</form>

		<button onclick="location.href='login'">로그인</button>


	 


</body>
</html>