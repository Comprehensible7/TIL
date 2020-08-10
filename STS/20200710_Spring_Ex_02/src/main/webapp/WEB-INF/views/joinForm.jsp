<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>

<script type="text/javascript">

	function formCheck(){

		var user_id = document.getElementById('user_id').value;
		var user_pw = document.getElementById('user_pw').value;
		
		var user_phone1 = document.getElementById('phone1').value;
		var user_phone2 = document.getElementById('phone2').value;
		var user_phone3 = document.getElementById('phone3').value;

		document.getElementById('total').value = user_phone1+"-"+user_phone2+"-"+user_phone3;


		// 아이디
		if(user_id == ''){
			alert('아이디를 입력해 주세요.');
			return false;
			
		} else if(user_id.length < 4 || user_id.length > 12){
			alert('아이디는 4~12자 사이로 입력해 주세요.');
			return false;
		}

		// 비밀번호
		if(user_pw == ''){
			alert('비밀번호를 입력해 주세요.');
			return false;
			
		} else if(user_pw.length < 4 || user_pw.length > 12){
			alert('비빌번호는 4~12자 사이로 입력해 주세요.');
			return false;
		}

		// 연락처
		if(user_phone1 == '' || user_phone2 == '' || user_phone3 == ''){
			alert('연락처를 입력해 주세요.');	
			return false;
		}

		else if(isNaN(user_phone1) || isNaN(user_phone2) || isNaN(user_phone3)){
			alert('숫자만 입력하세요.')

			return false;
			
		}

		
		return true;
		
	}




</script>

</head>
<body>

<h1>
	[ 회원 가입 폼 ]
</h1>

	<!-- 회원가입 폼으로 이동 -->

	<form action="/join" method="post" onsubmit="return formCheck()">
	
	ID : <input type="text" name="id" id="user_id"><br>
	PW : <input type="password" name="pw" id="user_pw"><br>
	Phone : <input type="text" id="phone1" > - <input type="text" id="phone2"> - <input type="text" id="phone3"> <br>
			<input type="hidden" name="phone" id="total">
	<input type="submit" value="가입">
	
	</form>


</body>
</html>