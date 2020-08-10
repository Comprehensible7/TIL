<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function formCheck(){

		var user_id = document.getElementById('user_id').value;
		var user_pw = document.getElementById('user_pw').value;
		var user_pw_check = document.getElementById('user_pw_check').value;
		var user_name = document.getElementById('user_name').value;


		if(user_id == '' || user_id.length==0){

			alert('아이디를 입력해 주세요.')
			return false;
		}

		if(user_pw =='' || user_pw.length==0){
			alert('비밀번호를 입력해 주세요.')

			return false;
		}

		if(user_pw != user_pw_check){
			alert('동일한 비밀번호를 입력해 주세요.')

			return false;
		}

		if(user_name =='' || user_name.length==0){
			alert('이름을 입력해 주세요.')

			return false;
		}
		
		return true;
	}

</script>

</head>
<body>

	<h1>[ 회원 가입 폼 ]</h1>
	
	<form action="/member/join" method="post" onsubmit="return formCheck();">
	
	ID : <input type="text" name="user_id" id="user_id"><br>
	PW : <input type="password" name="user_pw" id="user_pw"><br>
	PW-Check : <input type="password" id="user_pw_check"><br>
	Name : <input type="text" name="user_name" id="user_name"><br>
	Gender : <br>
	남 : <input type="radio" name="user_gender" value="m">
	여 : <input type="radio" name="user_gender" value="f">
	<br>
	<input type="submit" value="회원가입">
	
	</form>

</body>
</html>