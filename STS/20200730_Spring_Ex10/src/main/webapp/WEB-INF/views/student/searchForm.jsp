<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function formCheck() {
    
    var student_id = document.getElementById('student_id').value;
   /*  var student_name = document.getElementById('student_name').value; */
   
    if(student_id == '' || student_id.length == 0){
        alert('학번을 입력하세요.');
        return false;
        
    } else if(isNaN(student_id)){
		alert('학번은 숫자만 입력 가능합니다.')
		return false;
        }
   
      
    return true;
    
}


</script>
</head>
<body>

	<h1>[ 학생 검색 폼 ]</h1>

	<h4>조회할 학번을 입력해 주세요</h4>
	<form action="/student/search" method="get" onsubmit="return formCheck();">
	
	학번 : <input type="text" name="student_id" id="student_id" placeholder="학번을 입력해 주세요">
	<input type="submit" value="조회">
	
	</form>
	
	<!-- <form action="/student/search" method="get" onsubmit="return formCheck()">

	이름 : <input type="text" name="student_name" id="student_name" placeholder="이름을 입력해 주세요">
	<input type="submit" value="조회">
	</form> -->
	

		<ul>
			<li>
				<a href = "/">메인으로</a>
			</li>
		</ul>

</body>
</html>