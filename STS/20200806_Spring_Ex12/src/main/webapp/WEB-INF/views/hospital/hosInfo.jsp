<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 등록정보 ]</title>

	<script type="text/javascript">

		function hosUpdateForm(){

			var h_no = document.getElementById('h_no').value;
			
			location.href="/hospital/updateForm?h_no="+h_no;

			}

	</script>
</head>
<body>
		<h1>[ 등록정보 ]</h1>
		
		<table border="1" style="border-collapse:collapse">
		
			<tr>
				<th>등록순번</th>
				<td>${hosList.row_num }</td>
				
				<th>차트번호</th>
				<td>${hosList.h_no }</td>
				
				<th>환자번호</th>
				<td>${hosList.h_hnum }</td>
				
				<th>진료과</th>
				<td>${hosList.h_sec }</td>
			</tr>
			
			<tr>
				<th>위치</th>
				<td>${hosList.h_loc }</td>
				
				<th>의사명</th>
				<td>${hosList.h_doc }</td>
				
				<th>환자명</th>	
				<td>${hosList.h_name }</td>
				
				<th>담당간호사</th>
				<td>${hosList.h_sup }</td>
			</tr>
				
			<tr>
				<th>환자기록</th>
				<td>${hosList.h_info }</td>
				
				<th>진단명</th>
				<td>${hosList.h_res }</td>
				
				<th>진료비</th>
				<td>${hosList.h_price }원</td>
				
				<th>진료날짜</th>
				<td>${hosList.h_indate }</td>
			
			</tr>
		</table>
		<br>
		<a href="/">메인으로</a>
		
		<input type="button" value="수정하기" onclick="hosUpdateForm()">
		<input type="hidden" id="h_no" value="${hosList.h_no }">
		
</body>
</html>