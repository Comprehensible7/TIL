<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 환자 등록 ]</title>

<script type="text/javascript">

		function formCheck(){

			var h_hnum = document.getElementById('h_hnum').value;
			var h_hnum_check = document.getElementById('h_hnum_check').value;
			var h_sec = document.getElementById('h_sec').value;
			var h_loc = document.getElementById('h_loc').value;
			var h_doc = document.getElementById('h_doc').value;
			var h_name = document.getElementById('h_name').value;
			var h_name_check = document.getElementById('h_name_check').value;
			var h_sup = document.getElementById('h_sup').value;
			var h_price = document.getElementById('h_price').value;

			if(h_hnum == '' || h_hnum.length == 0){
				alert('환자번호를 입력해 주세요.')
				return false;
				
			}
			else if(h_hnum.length < 5 || h_hnum.length > 20){
				alert('환자번호는 5글자 이상 20글자 이하로 입력해 주세요.')
				return false;
				
				}

			if(h_hnum != h_hnum_check){
				alert('동일한 환자번호를 입력하세요')
				return false;
			} 
			
			if(isNaN(h_hnum)){
				alert('환자번호는 숫자만 입력 가능합니다')
				return false;
				}

			if(h_sec == '' || h_sec.length == 0){
				alert('진료과를 입력해 주세요')
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

			if(h_name != h_name_check){
				alert('동일한 환자명을 입력해 주세요')
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
		<h1>[ 환자 등록 페이지 ]</h1>
		
		<form action="/hospital/insert" method="post" onsubmit="return formCheck()">
		
		환자번호 : <input type="text" name="h_hnum" id="h_hnum"><br>
		환자번호 체크 : <input type="password" name="h_hnum_check" id="h_hnum_check" ><br>
		진료과 : <input type="text" name="h_sec" id="h_sec"><br>
		위치 : <input type="text" name="h_loc" id="h_loc"><br>
		의사명 : <input type="text" name="h_doc" id="h_doc"><br>
		환자명 : <input type="text" name="h_name" id="h_name"><br>
		환자명 체크 : <input type="text" name="h_name_check" id="h_name_check"><br>
		담당간호사 : <input type="text" name="h_sup" id="h_sup"><br>
		
		환자기록 : <br>
		<textarea rows="10" cols="50" name="h_info" id="h_info" maxlength="300">
		
		<!-- <input type="text" name="h_info" id="h_info"> -->
		
		</textarea>
		<br>
		
		진단명 : <br>
		<textarea rows="10" cols="50" name="h_res" id="h_res" maxlength="300">
		
		<!-- <input type="text" name="h_res" id="h_res"> -->
		
		</textarea>
		<br>
		
		진료비 : <input type="number" name="h_price" id="h_price">
		<br>
		<input type="submit" value="등록">
		
		</form>
		
		<a href="/">메인으로</a>
		
</body>
</html>