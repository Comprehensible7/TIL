<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>

<script type="text/javascript">

	/* jsp에서 name은 자바로 */
	/* js에서 id는 form action부분에서 */
	function formCheck(){

		var user_id = document.getElementById('user_id').value;
		var user_pw = document.getElementById('user_pw').value;
		var user_name = document.getElementById('user_name').value;
		var user_pw_check = document.getElementById('user_pw_check').value;
		
		var user_hobby = document.getElementsByName('user_hobby');
		


		// 아이디
		if(user_id == '' || user_id.length==0){
			alert('아이디를 입력해 주세요.')
			return false;
			
		} else if(user_id.length < 4 || user_id.length >10){
			alert('아이디는 4글자이상 10글자 이하로 입력해 주세요.')
			return false;
		}

		// 비밀번호
		if(user_pw == '' || user_pw.length==0){
			alert('비밀번호를 입력해 주세요.')
			return false;

		} else if(user_pw.length < 6 || user_pw.length > 12){
			alert('비밀번호는 6글자 이상 12글자 이하로 입력해 주세요')
			}

		// 비밀번호 체크
		if(user_pw != user_pw_check){
			alert('동일한 비밀번호를 입력하세요.')
			return false;
		}

		// 이름
		if(user_name == '' || user_name==0){
			alert('이름을 입력해 주세요.')
			return false;
		}

		var cnt = 0;

		for(var i = 0; i<user_hobby.length; i++){
			if(user_hobby[i].checked == true){

				cnt++;
			}
		}
		
		if(cnt<2){
			alert('취미는 반드시 2개이상 체크해 주세요.')
			return false;
		}
		

		
		return true;
	}

</script>

</head>
<body>

	<h1>[ 회원 가입 폼 ]</h1>
	
	<form action="/member/join" method="post" onsubmit="return formCheck();">
		
		ID : <input type="text" name=user_id id=user_id><br>
		PW : <input type="password" name="user_pw" id="user_pw"><br>
		PW-Check : <input type="password" id="user_pw_check"><br>
		Name : <input type="text" name="user_name" id="user_name"><br>
		
		Hobby <br>
		운동  <input type="checkbox" name=user_hobby value="training">
		영화감상  <input type="checkbox" name=user_hobby value="w_film">
		요리  <input type="checkbox" name=user_hobby value="cooking">
		사진  <input type="checkbox" name=user_hobby value="photo">
		여행  <input type="checkbox" name=user_hobby value="travel">
		
		<br>
		
		Gender : <br>
		남 : <input type="radio" name="user_gender" value="m" checked="checked">
		여 : <input type="radio" name="user_gender" value="f">
		
		<br>
		
		Introduce : <br>
		<textarea name="introduce" cols="40" rows="8" placeholder="자기소개를 입력하세요.">
		
		</textarea>
		<br>
		
		<input type="submit" value="회원가입">
		<input type="reset" value="취소">
	
	
	
	</form>

	
</body>
</html>