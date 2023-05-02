<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
	
</script>

<script type="text/javascript">
	$(function() {
		$("#f1").submit(function() {
			sendNumber()
			return false

		})
	})

	function sendNumber() {
		var n1 = $("#n1").val()
		var options = {
			/* 			url : "check_number.ng?no=" + n1,
			 */
			url : "check_number.ng/" + n1,
			success : function(data) {
				$("#msg").html(data.msg)
			},
			error : function() {

			}
		}
		$.ajax(options)
	}
</script>

</head>
<body>
	<h1>숫자멈추기 게임</h1>
	<h3>1-100 사이 숫자</h3>
	<form action="" id="f1">

		<fieldset>

			<legend>숫자입력</legend>
			<label> 숫자: <input id="n1" type="number" placeholder="1-100">
				<input type="submit" value="정답확인">
			</label>

		</fieldset>
	</form>
	<div id="msg"></div>
</body>
</html>