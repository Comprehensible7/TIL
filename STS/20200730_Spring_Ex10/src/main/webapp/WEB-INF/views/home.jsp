<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>[ 학사관리 시스템 ]</title>
</head>
<body>
<h1>
	[ 학사관리 시스템 ]  
</h1>
		
		<ul>
		<c:choose>
			<c:when test="${not empty sessionScope.loginId }">
            ${sessionScope.loginId }님 환영 합니다.
            <li><a href="/student/joinList">회원 목록 폼 이동</a></li>
            <li><a href="/student/searchForm">회원 조회 폼 이동</a></li>
				<li><a href="/student/logout">로그아웃</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="/student/loginForm">로그인 폼 이동</a></li>
				<li><a href="/student/joinForm">회원 가입 폼 이동</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
			
</body>
</html>
