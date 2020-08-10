<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	
	<table border="1">
	
	<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>취미</th>
			<th>성별</th>
			<th>자기소개</th>
	</tr>
	
	<c:forEach var="vo" items="${list }" varStatus="status">
	
		<tr>
			<td>${status.count }</td>
			<td>${vo.user_id }</td>
			<td>${vo.user_name }</td>
			<td>${vo.user_hobby }</td>
			<td>${vo.user_gender }</td>
			<td>${vo.introduce }</td>
			
		
		</tr>
	
	
	</c:forEach>
	
	</table>
	
	<ul>
		<li>
			<a href="/">홈으로 이동하기</a>
		</li>
	
	</ul>


</body>
</html>