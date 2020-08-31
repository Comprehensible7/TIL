<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	$(function(){

		/* 스크립트 문법 */
		/* document.getElementById('div1').onclick = function(){
				alert('World!')
			} */

		/* 쿼리 문법 */
		$('div').on('click', function(){

			alert('World!');
			
		})	

		/* 마우스 올라갔을때 */
		$('#div1').on('mouseenter',function(){
				$(this).html('World!')
				$(this).css('color', 'white')
				$(this).css('background-color', 'black')
				/* $(this).css({

					color: 'white',
					backgroundColor: 'black'
			})		 */
		})	
		/* 마우스 내려갔을때 */
		$('#div1').on('mouseleave', function(){
			$(this).html('Hello,')
			$(this).css({
				color: 'black',
				backgroundColor: 'white'
			})
		})
		/* 글씨 입력이벤트 발생 시 */
		$('input[type=text]').on('keydown', function(e){
			 console.log(e)
			/*  if(e.KeyCode == 13){
				// 로그인 진행
			}  */

		})
			$('input[type=text]').on('keyup', function(e){
				var txt = $(this).val()
				$('#div2').html(txt)
		})

		/* 이벤트의 대상 */
		$('input[type=radio]').on('change', function(){
			var val = $(this).val()
			$('#div2').html(val)
		})
	})
		

</script>
</head>
<body>

	<div id="div1">Hello!</div>
	
	<input type="text">
	<div id="div2"></div>
	
	<input type="radio" name="r" value="first">
	<input type="radio" name="r" value="second">
	<input type="radio" name="r" value="third">
	

</body>
</html>