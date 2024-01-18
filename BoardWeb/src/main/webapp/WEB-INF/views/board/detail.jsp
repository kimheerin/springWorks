<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
   <h2>게시글 상세보기</h2>
   <div>
      
         <p><input type="text" name="id" value="${board.id}"> </p>
         <p><input type="text" name="btitle" value="${board.btitle}"> </p>
         <p><input type="text" name="bwriter" value="${board.bwriter}"> </p>
         <p><textarea rows="4" cols="60" name="bcontent" >${board.bcontent}</textarea></p>
         <p><a href="/board/list"><button type="button" >목록</button></a></p>
   </div>
</body>
</html>