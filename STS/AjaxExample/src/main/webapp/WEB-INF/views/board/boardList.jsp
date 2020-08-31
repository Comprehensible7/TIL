<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style type="text/css">
	table {
		margin: 0 auto;
	}
	
	table tr th:nth-child(2) {
		width: 500px;
	}
</style>
</head>
<body>
	<table border=1>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${list }" var="board">
			<tr>
				<td>${board.boardNum }</td>
				<td>
					<a href="/board/readBoard?boardNum=${board.boardNum }">
						${board.title }
					</a>
				</td>
				<td>${board.writer }</td>
				<td>${board.indate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>