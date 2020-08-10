<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[개인 회원 정보]</title>
<script type="text/javascript">
	function memberUpdateForm() {
		var member_id = document.getElementById("member_id").value;
		
		location.href = "/member/memberUpdateForm?member_id=" + member_id;
	}
</script>

</head>
<body>
	<h1>[회원 정보]</h1>
	
	ID: ${member.member_id }<br>
	PW: ${member.member_pw }<br>
	Name: ${member.member_nm }<br>
	등록일: ${member.member_indate }<br>
	
	<input type="button" value="수정하기" onclick="memberUpdateForm()">
	<input type="hidden" id="member_id" value="${member.member_id }">
	<!-- 자바스크립트가 사용해야하는데 미리 id값을 주고 숨겨놓은거 // 나중에 사용하기 위해서 -->
	<br>
	<a href="/">메인으로</a>
</body>
</html>