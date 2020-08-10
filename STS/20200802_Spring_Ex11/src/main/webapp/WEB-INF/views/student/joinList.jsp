<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 목록 ]</title>

</head>
<body>
	
	<h1>회원 목록</h1>

	<table border="1" style="border-collapse:collapse">
	
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>비밀번호</th>
				<th>생년월일</th>
				<th>지역</th>
				<th>전공</th>
				<th>가입날짜</th>
				<th></th>
			</tr>
			
		<c:forEach var="s" items="${studentList }">
		
			<tr>
				<td>${s.s_num }</td>
				<td>${s.s_id }</td>
				<td><a href="/student/updateForm?s_id=${s.s_id }&s_name=${s.s_name}&s_pw=${s.s_pw}&s_birth=${s.s_birth}&s_loc=${s.s_loc}&s_subject=${s.s_subject}&s_indate=${s.s_indate}">${s.s_name }</a></td>
				<td>${s.s_pw }</td>
				<td>${s.s_birth }</td>
				<td>${s.s_loc }</td>
				<td>${s.s_subject }</td>
				<td>${s.s_indate }</td>
				<td><a href="/student/delete?s_id=${s.s_id }">삭제</a></td>
			</tr>
						
		</c:forEach>
	</table>
	
	<a href="/">메인으로</a>


</body>
</html>