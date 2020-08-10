/**
 * 입력 폼 유효성 검사 함수
 */
 
 function inputFormCheck(){
 	var name = document.getElementById('name');
 	var age = document.getElementById('age');
 	
 	if(name.value == ''){
 		alert('이름을 입력하세요.')
 		return false;
 	}
 	
 	if(age.value == '' || isNaN(age.value)){
 		alert('나이를 숫자로 입력하세요.')
 		return false;
 	}
 	return true;
 }