<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 수정 폼 ]</title>

		<script type="text/javascript">

			function formCheck(){

			var h_sec = document.getElementById('h_sec').value;
			var h_loc = document.getElementById('h_loc').value;
			var h_doc = document.getElementById('h_doc').value;
			var h_name = document.getElementById('h_name').value;
			var h_sup = document.getElementById('h_sup').value;
			var h_price = document.getElementById('h_price').value;
				

			if(h_sec == '' || h_sec.length == 0){
				alert('진료과를 입력해 주세요.')
				return false;
				}

			if(h_loc == '' || h_loc.length == 0){
				alert('위치를 입력해 주세요')
				return false;
				
				} 

			if(h_doc == '' || h_doc.length == 0){
				alert('의사명을 입력해 주세요')
				return false;
				}

			if(h_name == '' || h_name.length == 0){
				alert('환자명을 입력해 주세요.')
				return false;
				}

			if(h_sup == '' || h_sup.length == 0){
				alert('담당 간호사명을 입력해 주세요.')
				return false;
				}

			if(h_price == '' || h_price == 0){
				alert('진료비를 입력해 주세요.')
				return false;
				}
			
				return true;
			}

		</script>
	
</head>
<body>
	<h1>[ 정보 수정 ]</h1>
	
	<form action="/hospital/update" method="get" onsubmit="return formCheck()">
		
		등록순번 : <input type="text" name="h_no" id="h_no" value="${hosList.h_no }" readonly><br>
		환자번호 : <input type="text" name="h_hnum" id="h_hnum" value="${hosList.h_hnum }" readonly><br>
		진료과 : <input type="text" name="h_sec" id="h_sec"><br>
		위치 : <input type="text" name="h_loc" id="h_loc"><br>
		의사명 : <input type="text" name="h_doc" id="h_doc"><br>
		환자명 : <input type="text" name="h_name" id="h_name"><br>
		환자명 체크 : <input type="text" name="h_name_check" id="h_name_check"><br>
		담당간호사 : <input type="text" name="h_sup" id="h_sup"><br>
		
		환자기록 : <br>
		<textarea rows="10" cols="50" name="h_info" id="h_info" maxlength="300">
		
		${hosList.h_info }
		
		</textarea>
		<br>
		
		진단명 : <br>
		<textarea rows="10" cols="50" name="h_res" id="h_res" maxlength="300">
		
		${hosList.h_res }
		
		</textarea>
		<br>
		
		진료비 : <input type="number" name="h_price" id="h_price" value="${hosList.h_price }">
		<br>
		<input type="submit" value="수정">
		
		</form>
		
		<a href="/">메인으로</a>
		
	 
</body>
</html>