<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 폼</title>

<script type="text/javascript">

function formCheck() {
    
    var member_id = document.getElementById('member_id').value;
   
    if(member_id == '' || member_id.length == 0){
        alert('아이디를 입력하세요.');
        return false;
        
    } 
      
    return true;
    
}


</script>
</head>
<body>

	<h1>[ 회원 검색 폼 ]</h1>

	<h4>조회할 아이디를 입력해 주세요</h4>
	<form action="/member/search" method="get" onsubmit="return formCheck();">
	
	ID : <input type="text" name="member_id" id="member_id" placeholder="아이디를 입력해 주세요">
	<input type="submit" value="전송"/>
	
	</form>
	

		<ul>
			<li>
				<a href = "/">홈으로 이동합니다</a>
			</li>
		</ul>

</body>
</html>