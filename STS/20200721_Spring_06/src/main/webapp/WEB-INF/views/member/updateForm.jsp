<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 폼</title>

<script type="text/javascript">

function formCheck() {
    
    var member_pw = document.getElementById('member_pw').value;
    var member_nm = document.getElementById('member_nm').value;
    
    
    if(member_pw == '' || member_pw.length == 0){
        alert('비밀번호를 입력하세요.');
        return false;
        
    } else if(member_pw.length < 6 || member_pw.length > 10){
        alert('비밀번호는 6글자이상 10글자 이하로 입력해 주세요.');
    }
    
    if(member_nm == '' || member_nm == 0){
       alert('이름을 입력해 주세요.');
        return false;
        
    }else if(member_nm.length < 3 || member_nm > 6){
	   alert('이름은 3글자이상 6글자 이하로 입력해 주세요.');
		return false;
   	}
    
    return true;
    
}


</script>

</head>
<body>


	<h3>[ 기존 가입 정보 ]</h3>
	
	
<table border="1" style="border-collapse:collapse;">
	
		
	<tr>	
		<th>ID</th>
		<th>PW</th>
		<th>이름</th>
		<th>가입일</th>
	</tr>	
	
	<tr>
		<td>${member_id }</td>
		<td> ${member_pw }</td>
		<td> ${member_nm }</td>
		<td> ${member_indate }</td>
		
	</tr>
</table>
<br>		
		<h3>[ 회원 수정 폼 ]</h3>
		
		
		<form action="/member/update" method="post" onsubmit="return formCheck()">
		
		<table border="1" style="border-collapse:collapse;">
		
		<tr>
		
			<th>ID</th>
			<th>PW</th>
			<th>이름</th>
			<th>가입일</th>
			
			
		</tr>	
		
		<tr>
		
		<td> <input type="text" name="member_id" id="member_id" value="${member_id }" readonly="readonly"></td>
		<td> <input type="password" name="member_pw" id="member_pw" placeholder="비번입력"></td>
		<td> <input type="text" name="member_nm" id="member_nm" placeholder="이름입력"></td>
		<td> <input type="text" name="member_indate" id="member_indate" value="${member_indate }" readonly="readonly"></td>
		<td> <input type="submit" value="수정하기"></td>
		</tr>
			
			
		</table>
		
		</form>
		
		
		
		
		<ul>
			<li>
				<a href = "/">홈으로 이동하기</a>
			</li>
		</ul>
		
</body>
</html>