<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h1>[메인 화면]</h1>
	<ul>
		<c:choose>
			<c:when test="${not empty sessionScope.loginId }">
            ${sessionScope.loginId }님 환영 합니다.
            <li><a href="/member/joinList">회원 목록 폼 이동</a></li>
				<li><a href="/member/logout">로그아웃</a></li>
				<li><a href="/board/boardList">글 목록 페이지</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="/member/loginForm">로그인 폼 이동</a></li>
				<li><a href="/member/joinForm">회원 가입 폼 이동</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>
