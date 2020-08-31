<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 로그인 ]</title>
	
	<script type="text/javascript">

		function formCheck(){

			var book_user
			var book_pw

		}
		

	</script>
	
</head>
<body>
		<h1>[ 로그인 ]</h1>
		
		<form action="/book/login" method="post" onsubmit="return formCheck()">
		
			사용자 : <input type="text" name="book_user" id="book_user"><br>
			비밀번호 : <input type="password" name="book_pw" id="book_pw"><br>
		
			<input type="submit" value="로그인">
		
		</form>
		<br>
		<a href="/">메인으로</a>
</body>
</html>