<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>[ 도서관리 ]</title>
</head>
<body>
<h1>
	[ 도서관리 ]  
</h1>

<c:choose>
	<c:when test="${not empty sessionScope.loginId }">
	${sessionScope.loginId }님 환영합니다. <br>
		
		<a href="/book/logout">로그아웃</a><br>	
		<a href="/book/bookList">정보 조회</a><br>
	</c:when>
	
	<c:otherwise>
		<a href="/book/loginForm">로그인</a><br>
		<a href="/book/insertBookForm">정보 등록</a><br>
	</c:otherwise>
</c:choose>

</body>
</html>
