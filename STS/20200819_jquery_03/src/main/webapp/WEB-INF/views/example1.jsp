<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

   $(function() {
	   // 아이디 입력란에 keyup 이벤트를 연결한다.
      $("input[type=text]").keyup(function(e) {
         // 아이디 입력란에 입력된 데이터를 변수애 저장한다.
         var data = $(this).val();

         // 입력된 데이터의 글자 수가 4글자 미만인지 검사한다.
         if(data.length < 4) {
            // 4글자 미만이면
            $("#idCheck").css("color", "red");
            $("#idCheck").text("아이디는 4자리 이상 입력하세요.");
         } else {
            // 4글자 이상이면
            $("#idCheck").css("color", "green");
            $("#idCheck").text("사용할 수 있는 아이디입니다.");
         }

         // 엔터 눌렀을 때 유효성 감사 실행
         if(e.keyCode == 13)   formCheck();
      });

	   // 비밀번호 keyup이벤트 연결
      $("input[type=password]").keyup(function(e){
         var data = $(this).val();

         // 4글자 미만
         if(data.length < 4) {
            $("#pwCheck").css("color", "red");
            $("#pwCheck").text("비밀번호는 4자리 이상 입력하세요.");
         } else {
            // 4글자 이상
            $("#pwCheck").css("color", "green");
            $("#pwCheck").text("사용할 수 있는 비밀번호입니다.");
         }
         // 엔터 눌렀을 때
         if(e.keyCode == 13)   formCheck();
         
      });

      $("input[type=button]").click(formCheck);
      
   });

   // 유효성 검사 함수
   function formCheck() {
      var userid = $("input[type=text]").val();
      var userpw = $("input[type=password]").val();
      var gender = $("input[type=radio]:checked");
      var hobby = $("input[type=checkbox]:checked");

      var flag = true;

      if(userid.length < 4) {
         $("#idCheck").css("color", "red");
         $("#idCheck").text("아이디는 4자리 이상 입력하세요.");
         flag = false;
      } else {
         $("idCheck").css("color", "green");
         $("idCheck").text("");
      }

      if(userpw.length < 4) {
         $("#pwCheck").css("color", "red");
         $("#pwCheck").text("비밀번호는 4자리 이상 입력하세요.");
         flag = false;            
      } else {
         $("pwCheck").css("color", "green");
         $("pwCheck").text("");
      }

      if(gender.length < 1) {
         $("#genderCheck").css("color", "red");
         $("#genderCheck").text("성별을 선택하세요.");
         flag = false;            
      } else {
         $("genderCheck").css("color", "green");
         $("genderCheck").text("");
      }

      if(hobby.length < 1) {
         $("#hobbyCheck").css("color", "red");
         $("#hobbyCheck").text("취미를 한 개 이상 선택하세요.");
         flag = false;            
      } else {
         $("hobbyCheck").css("color", "green");
         $("hobbyCheck").text("");
      }

      // 모든데이터가 제대로 입력되었다면 flag는 true로써 데이터 전송을 진행한다.
      if(flag) $("form").submit();
   }
</script>
</head>
<body>
   <form action="/join" method="get">
      <table>
         <tr>
            <td>아이디</td>   <!-- 4자리 이상 입력 -->
            <td><input type="text" name="userid"></td>
            <td><div id="idCheck"></div></td>
         </tr>
         <tr>
            <td>비밀번호</td>   <!-- 4자리 이상 입력 -->
            <td><input type="password" name="userpw"></td>
            <td><div id="pwCheck"></div></td>
         </tr>
         <tr>
            <td>성별</td>      <!-- 무조건 하나 선택 -->
            <td>
               남자<input type="radio" name="gender">
               여자<input type="radio" name="gender">
            </td>
            <td><div id="genderCheck"></div></td>
         </tr>
         <tr>
            <td>취미</td>      <!-- 무조건 하나이상 선택 -->
            <td>
               독서<input type="checkbox" name="hobby">
               음악 감상<input type="checkbox" name="hobby">
               게임<input type="checkbox" name="hobby">
            </td>
            <td><div id="hobbyCheck"></div></td>
         </tr>
      </table>
      <input type="button" value="가입하기">
   </form>
</body>
</html>