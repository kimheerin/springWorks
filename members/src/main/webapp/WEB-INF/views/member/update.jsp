<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정</title>
<style>
   .content{margin-left: 30px;}
</style>
</head>
<body>
   <div class="content">
      <h2>회원 수정</h2>
      <form action="/member/update" method="post" name="updatForm">
         <p>
            <label>번호</label>
            <input type="text" name="id" value="${member.id}" readonly>
         </p>
         <p>
            <label>이메일</label>
            <input type="text" name="email" value="${member.email}" >
         </p>
         <p>
            <label>비밀번호</label>
            <input type="password" name="password" value="${member.password}" >
         </p>
         <p>
            <label>이름</label>
            <input type="text" name="name" value="${member.name}">
         </p>
         <p>
            <label>나이</label>
            <input type="text" name="age" value="${member.age}">
         </p>
         <p>
            <button type="button" value="목록" onclick="updateFn()">수정</button>
            <button type="button" value="목록" onclick="backFn()">이전</button>
         </p>
   </form>
   </div>
<script>
   //수정
   const updateFn = function() {
      document.updateform.submit();
   }
   //이전 보기 버튼
   const backFn = function() {
      location.href = "/main";
   }
  
   
</script>
</body>
</html>