<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>

	<script type="text/javascript">

		function formCheck(){

			var student_id = document.getElementById('student_id').value;
			var student_pw = document.getElementById('student_pw').value;
			var student_pw_check = document.getElementById('student_pw_check').value;

			var	student_name = document.getElementById('student_name').value;
			var student_subject = document.getElementById('student_subject').value;
			
		if(student_id == '' || student_id.length == 0){
			alert('학번을 입력해 주세요.')
			return false;
		} else if(student_id.length < 4 || student_id.length > 10){
			alert('학번을 4글자 이상 10글자 이하로 입력해 주세요.')
			return false;
			}

		else if(isNaN(student_id)){
			alert('학번은 숫자만 입력 가능합니다.')
			return false;
			}
		

		if(student_pw == '' || student_pw.length == 0){
			alert('비밀번호를 입력해 주세요.')
			return false;
		} else if(student_pw.length < 6 || student_pw.length > 10){
			alert('비밀번호는 6글자 이상 10글자 이하로 입력해 주세요.')
			return false;
			}
		
		if(student_pw != student_pw_check){
			alert('비밀번호를 동일하게 입력해 주세요.')
			return false;
			} 

		if(student_name == '' || student_name.length == 0){
			alert('이름을 입력해 주세요.')
			return false;
			} else if(student_name.length < 2 || student_name.length > 10){
			alert('이름은 2글자 이상 10글자 이하로 입력해 주세요.')	
			return false;
				}

		if(student_subject == '' || student_subject.length == 0){
			alert('전공명을 입력해 주세요.')
			return false;
			}else if(student_subject.length < 2 || student_subject.length > 20){
				alert('전공명은 2글자 이상 20글자 이하로 입력해 주세요.')
				return false;
				}

			return true;
		}

	</script>

</head>
<body>

	<h1>[ 회원 가입 ]</h1>

	<form action="/student/join" method="post" onsubmit="return formCheck()">
	
	학번 : <input type="text" id="student_id" name="student_id"><br>
	비밀번호 : <input type="password" id="student_pw" name="student_pw"><br>
	비밀번호 체크 : <input type="password" id="student_pw_check" name="student_pw_check"><br>
	이름 : <input type="text" id="student_name" name="student_name"><br>
	학과 : <input type="text" id="student_subject" name="student_subject"><br>
	<input type="submit" value="회원 가입"> 
	 
	
	</form>
	
	<a href="/">메인으로</a>

</body>
</html>