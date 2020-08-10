<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>[ 진료 관리 시스템 ]</title>
</head>
<body>

<h1>[ 진료 관리 시스템 ]</h1>

<ul>
	<c:choose>
		<c:when test="${not empty sessionScope.loginId }">
			${sessionScope.loginId }님 환영합니다.
			<li><a href="/hospital/allInfo">조회 목록</a></li>
			<li><a href="">병원 게시판</a></li>
			<li><a href="/hospital/logout">로그아웃</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="/hospital/loginForm">로그인</a></li>
			<li><a href="/hospital/insertForm">환자 등록</a></li>
		</c:otherwise>
	</c:choose>
</ul>
</body>
</html>
