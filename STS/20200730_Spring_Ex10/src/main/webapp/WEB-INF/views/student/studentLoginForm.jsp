<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 로그인 폼 ]</title>

<script type="text/javascript">

function formCheck() {
    
    var student_id = document.getElementById('student_id').value;
    var student_pw = document.getElementById('student_pw').value;
   
    if(student_id == '' || student_id.length == 0){
        alert('학번을 입력하세요.');
        return false;
        
    } else if(student_id.length < 4 || student_id.length > 10){
        alert('학번은 4글자 이상 10글자 이하로 입력해 주세요.');
        return false;
    }
    
    if(student_pw == '' || student_pw.length == 0){
        alert('비밀번호를 입력하세요.');
        return false;
        
    } else if(student_pw.length < 6 || student_pw.length > 10){
        alert('비밀번호는 6글자 이상 10글자 이하로 입력해 주세요.');
        return false;
    }
  
    
    return true;
    
}


</script>
</head>
<body>

	<h1>[ 로그인 폼 ]</h1>
	
	<form action="/student/login" method="post" onsubmit="return formCheck()">
		
		ID : <input type = "text" name="student_id" id="student_id"><br>
		PW : <input type = "password" name="student_pw" id="student_pw"><br>
		<input type="submit" value="로그인">
	
	</form>
	
	<a href="/">메인으로</a>
	
</body>
</html>