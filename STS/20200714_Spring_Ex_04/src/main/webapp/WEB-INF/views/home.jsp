<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="id" value="owner" scope="request"/>
		
	${id } : 총 관리자 <br>

	<c:remove var="id" scope="request"/>	
	
	${id } 운영자 <br>
	
	<c:if test="${10<20 }">
		10은 20보다 작다.
	</c:if>
	
	<c:if test="${not empty str }">
		<p> ${str }님 환영합니다. </p>
	</c:if>
	
	<c:choose> 
		<c:when test="${num < 20 }">
			${num }은 20보다 작다.
		</c:when>
	
		<c:otherwise>
			${num }은 20보다 크다.
		</c:otherwise>
	</c:choose>
	<br>
	
	
	<table border="1">
	
		<tr>
			<th>이름</th>
		</tr>
		
		<c:forEach var="s" items="${list }">
			<tr>
				<td>${s }</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>생산번호</th>
			<th>제품번호</th>
			<th>가격</th>
			<th>생산일자</th>
		</tr>
		
		
		<c:forEach var="vo" items="${list2 }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${vo.name }</td>
				<td>${vo.s_num }</td>
				<td>${vo.product_c }</td>
				<td>${vo.price }</td>
				<td>${vo.m_date }</td>
			</tr>
			
		
		</c:forEach>
	
	</table>
	
</body>
</html>
