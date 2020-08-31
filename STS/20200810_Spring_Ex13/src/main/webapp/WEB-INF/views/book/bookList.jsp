<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 등록도서 정보조회 ]</title>
</head>
<body>
		<h1>[ 등록도서 정보조회 ]</h1>
		
		<table border="1" style="border-collapse:collapse">
		
		<c:forEach items="${bookList }" var="book">
		
		<tr>
			<th>등록순서</th>
			<th>사용자</th>
			<th>분류번호</th>
			<th>비밀번호</th>
			<th>도서명</th>
			<th>저자명</th>
			<th>출판사</th>
			<th>도서장르</th>
			<th>도서가격</th>
			<th>등록일자</th>
			<th>삭제</th>
		</tr>
		
		
		<tr>
			<td>${book.book_row }</td>
			<td>${book.book_id }</td>
			<td>${book.book_user }</td>
			<td>${book.book_pw }</td>
			<td><a href="/book/bookSelectOne?book_id=${book.book_id }">${book.book_name }</a></td>
			<td>${book.book_auth }</td>
			<td>${book.book_pub }</td>
			<td>${book.book_loc }</td>
			<td>${book.book_price }</td>
			<td>${book.book_indate }</td>	
			<td><a href="/book/deleteOne?book_id=${book.book_id }">Delete</a></td>
		</tr>
		
		
		</c:forEach>
		
		
		</table>
		
		<a href="/">메인으로</a>
		
</body>
</html>