<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 로그인 ]</title>

	<script type="text/javascript">

		function formCheck(){

			var s_id = document.getElementById('s_id').value;
			var s_pw = document.getElementById('s_pw').value;

			if(s_id=='' || s_id.length==0){
				alert('아이디를 입력해 주세요')
				return false;
			} else if(s_id.length < 2 || s_id.length > 10){
				alert('아이디는 2글자 이상 10글자 이하로 입력해 주세요')
				return false;
			} 

			if(isNaN(s_id)){
				alert('아이디는 숫자만 입력 가능합니다')
				return false;
			}

			if(s_pw == '' || s_pw.length == 0){
				alert('비밀번호를 입력해 주세요')
				return false;
			} else if(s_pw.length < 5 || s_pw.length > 20){
				alert('비밀번호는 5글자 이상 20글자 이하로 입력해 주세요')
				return false;
			}
			return true;
		}


	</script>

</head>
<body>

		<form action="/student/login" method="post" onsubmit="return formCheck">
		
		아이디 : <input type="text" id="s_id" name="s_id" placeholder="아이디를 입력"><br>
		비밀번호 : <input type="password" id="s_pw" name="s_pw" placeholder="비밀번호를 입력"><br>
		
		<input type="submit" value="로그인">
		</form>
		
		<a href ="/"> 메인으로</a>

</body>
</html>