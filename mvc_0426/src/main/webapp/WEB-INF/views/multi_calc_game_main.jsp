<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multi_calc_agme_main.jsp</title>
</head>
<body>
	<h1>곱셈게임</h1>
	<a href="multi_calc_game">게임 다시 시작</a>


	<h3>${game_seq}번문제</h3>

	<form action="" method="post">


	  <input type="number"
			name="n1" value="${r1}" readonly="readonly"
			style="text-align: center; width: 5em;"> * <input
			type="number" name="n2" value="${r2}" readonly="readonly"
			style="text-align: center; width: 5em;"> = <input
			type="number" name="ans" style="text-align: center; width: 5em;">
		<br> <input type="submit" value="정답확인">
		
	</form>

	<div>${result}</div>

</body>
</html>