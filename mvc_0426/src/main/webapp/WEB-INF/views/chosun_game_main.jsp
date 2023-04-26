<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chosun_game_main.jsp</title>
</head>
<body>

	<h1>초성게임</h1>
	<a href="chosun_game_main">게임 다시 시작</a>


	<h3>초성게임</h3>

	<form action="" method="post">
		<input type="text" name="n1" value="${str}" readonly="readonly"
			style="text-align: center; width: 5em;"> <br> <input
			type="text" name="userans" style="text-align: center; width: 5em;">
		<br> <input type="submit" value="정답확인">

	</form>

	<div>${result}</div>

</body>
</html>