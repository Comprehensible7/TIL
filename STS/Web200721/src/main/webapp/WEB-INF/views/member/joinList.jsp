<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회원정보 목록 페이지</title>
</head>
<body>

	<h1>[회원정보]</h1>

	<table border="1" style="border-collapse:collapse;">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>등록일자</th>
			<th></th>
		</tr>
		<c:forEach items="${memberList }" var="member" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>
					<a href="/member/selectOne?member_id=${member.member_id }">${member.member_nm }</a>
				</td>
				<td>${member.member_indate }</td>
				<td>
					<a href="/member/delete?member_id=${member.member_id }">삭제</a>	
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="/">메인으로</a>

</body>
</html>