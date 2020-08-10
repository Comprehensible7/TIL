<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 가입 ]</title>

	<script type="text/javascript">

		function formCheck(){

			var s_id = document.getElementById('s_id').value;
			var s_name = document.getElementById('s_name').value;
			var s_pw = document.getElementById('s_pw').value;
			var s_pw_check = document.getElementById('s_pw_check').value;
			var s_birth = document.getElementById('s_birth').value;
			var s_loc = document.getElementById('s_loc').value;
			var s_subject = document.getElementById('s_subject').value;

		}

	</script>
	
</head>
<body>
	
	<h1>회원 가입</h1>

	<form action="/student/join" method="post" onsubmit="return formCheck()">
	
		아이디 : <input type="text" name="s_id" id="s_id" placeholder="아이디를 입력"><br>
		이름 : <input type="text" name="s_name" id="s_name" placeholder="이름을 입력"><br>
		비밀번호 : <input type="password" name="s_pw" id="s_pw" placeholder="비밀번호를 입력"><br>
		비밀번호 체크 : <input type="text" name="s_pw_check" id="s_pw_check" placeholder="비밀번호를 다시 입력"><br>
		생년월일 : <input type="text" name="s_birth" id="s_birth" placeholder="생년월일을 입력"><br>
		지역 : <input type="text" name="s_loc" id="s_loc" placeholder="지역을 입력"><br>
		전공 : <input type="text" name="s_subject" id="s_subject" placeholder="전공을 입력"><br>
		<input type="submit" value="회원가입"><br>
	
	</form>
	
	<a href="/">메인으로</a>

</body>
</html>