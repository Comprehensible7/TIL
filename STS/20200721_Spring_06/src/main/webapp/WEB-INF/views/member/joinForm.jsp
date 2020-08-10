<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 여기 위에있는건 디렉티브라고 함 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>

<script type="text/javascript">

function formCheck() {
    
    var member_id = document.getElementById('member_id').value;
    var member_pw = document.getElementById('member_pw').value;
    var member_nm = document.getElementById('member_nm').value;
    
    var member_pw_check = document.getElementById('member_pw_check').value;
    
    if(member_id == '' || member_id.length == 0){
        alert('아이디를 입력하세요.');
        return false;
        
    } else if(member_id.length < 4 || member_id.length > 10){
        alert('아이디는 4글자이상 10글자 이하로 입력해 주세요.');
        return false;
    }
    
    if(member_pw == '' || member_pw.length == 0){
        alert('비밀번호를 입력하세요.');
        return false;
        
    } else if(member_pw.length < 6 || member_pw.length > 10){
        alert('비밀번호는 6글자이상 10글자 이하로 입력해 주세요.');
        return false;
    }
    
    if(member_pw != member_pw_check){
       alert('동일한 비밀번호를 입력해 주세요.');
        return false;
    }
    
    if(member_nm == '' || member_nm == 0){
       alert('이름을 입력해 주세요.');
        return false;
        
    } else if(member_nm.length < 3 || member_nm.length > 6){
	   alert('이름은 3글자이상 6글자 이하로 입력해 주세요.');
	   return false;

    }
    
    return true;
    
}


</script>

</head>
<body>

	<h1>[ 회원 가입 폼 ]</h1>

	<!-- name값은 vo와 동일하게 입력 -->
	<!-- Controller의 join값, method -->
	<form action="/member/join" method="post" onsubmit="return formCheck()">
	
		ID : <input type="text" name="member_id" id="member_id"><br>
		PW : <input type="password" name="member_pw" id="member_pw"><br>
		Pw_Check : <input type="password" name="member_pw_check" id="member_pw_check"><br>
		Name : <input type="text" name="member_nm" id="member_nm"><br>
		<input type="submit" value="회원가입">
	
	</form>
	
	<a href="/">메인으로</a>

</body>
</html>