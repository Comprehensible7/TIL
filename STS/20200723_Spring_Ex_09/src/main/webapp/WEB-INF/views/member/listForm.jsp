<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색</title>
</head>
<body>

	<h1>회원 목록</h1>

	<form action="/member/search" method="get" onsubmit="">

		최소 생년월일 : <input type="text" name="member_min" id="member_min">
		~ 최대 생년월일 : <input type="text" name="member_max" id="member_max"> 
		<input type="submit" value="검색">

	</form>
	
	<c:if test = "${memberList.size()== 0 }">
		<h1>등록된 회원이 없습니다.</h1>
		
	</c:if>
	
	<c:if test="${memberList.size()>0 }">
	
	<br>

	<table border="1">

		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>등록일자</th>
			<th>삭제</th>
			<th>수정</th>
		<tr>


			<c:forEach var="member" items="${memberList}" varStatus="status">

				<tr>

					<td>${status.count }</td>
					<td>${member.member_id }</td>
					<td>${member.member_nm }</td>
					<td>${member.member_birth }</td>
					<td>${member.member_indate }</td>
					
					
		<td><a href="/member/delete?member_id=${member.member_id }">회원삭제</a></td>
		<td><a href="/member/updateForm?member_id=${member.member_id }">회원수정</a></td>
		
					
					
				</tr>

			</c:forEach>
			
		
			
	</table>
	</c:if>

	<ul>
		<li><a href="/">메인으로</a></li>
	</ul>



</body>
</html>