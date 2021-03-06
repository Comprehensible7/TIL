<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>

<script type="text/javascript">

	function formCheck(){

	var member_id = document.getElementById('member_id').value;
	var member_pw = document.getElementById('member_pw').value;
	var member_nm = document.getElementById('member_nm').value;

	if(member_id == '' || member_id.length == 0){
			alert('아이디를 입력하세요.')
			return false;
			
		} else if(member_id.length < 4 || member_id.length > 10 ){
				alert('아이디는 4글자이상 10글자 이하로 입력해 주세요.')
				return false;
			}

	if(member_pw == '' || member_pw.length == 0){
			alert('비밀번호를 입력해 주세요.')
			return false;
			
		} else if(member_pw.length < 5 || member_pw.length > 10 ){
					alert('비밀번호는 5글자이상 10글자 이하로 입력해주세요.')
			return false;
			}

	if(member_nm == '' || member_nm.length == 0){
			alert('이름을 입력해 주세요.')
		return false;
			
		} else if(member_nm.length < 3 || member_nm > 6){
				alert('이름은 3글자이상 6글자 이하로 입력해주세요.')
			return false;
			}

	return true;
	}
</script>

</head>
<body>

	<h1>[회원가입 폼]</h1>

	<form action="/member/join" method="post" onsubmit="return formCheck()">
		ID: <input type="text" name="member_id" id="member_id"> <br>
		PASSWORD: <input type="password" name="member_pw" id="member_pw">
		<br> NAME: <input type="text" name="member_nm" id="member_nm">
		<br> <input type="submit" value="가입">
	</form>
	<br>
	<a href="/">메인으로</a>
</body>
</html>