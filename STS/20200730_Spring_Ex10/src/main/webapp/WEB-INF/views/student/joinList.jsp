<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학번 조회 시스템</title>
</head>
<body>

		<h1>[ 학번 조회 시스템 ]</h1>
		
		<table border="1" style="border-collape:collapse;">
		
			<tr>
				<th>번호</th>
				<th>학번</th>
				<th>이름</th>
				<th>학과명</th>
				<th>등록일자</th>
				<th></th>
			
			</tr>
			
			<c:forEach var="student" items="${studentList }" varStatus="status">
			
				
				<tr>
				
					<td>${student.row_num }</td>
					<td>${student.student_id }</td>
					<td><a href="/student/updateForm?student_id=${student.student_id }&student_pw=${student.student_pw}&student_name=${student.student_name}&student_subject=${student.student_subject}&student_indate=${student.student_indate}">${student.student_name }</a></td>
					<td>${student.student_subject }</td>
					<td>${student.student_indate }</td>
					<td><a href="/student/delete?student_id=${student.student_id }">삭제</a></td>
			
			
				</tr>
				
			</c:forEach>
			
		</table>
		
		<a href="/">메인으로</a>	
		
</body>
</html>