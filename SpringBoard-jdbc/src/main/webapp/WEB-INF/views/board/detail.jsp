<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
   <div id="content">
      <h2>글 상세보기</h2>
      <table>
      	<tr>
      		<td>
      			<label></label>
      			<input type="text" name="boardTitle" value="${board.boardTitle}"
      			placeholder="글제목" readonly>
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label></label>
      			<input type="text" name="boardWriter" value="${board.boardWriter}"
      			placeholder="작성자" readonly>
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label></label>
      			<textarea rows="5" cols="50" name="boardContent"
      			placeholder="글내용" readonly>${board.boardContent}</textarea>
      		</td>
      	</tr>
      	<tr>
      		<td>
      		<!-- 로그인 사용자만 수정 및 삭제 버튼 보이기-->
				<c:if test="${board.boardWriter eq sessionId}">
	      			<a href="/board/update?id=${board.id}">
	      				<button>수정</button>
	      			</a>
	      			<a href="/board/delete?id=${board.id}"
	      			onclick="return confirm('삭제하시겠습니까?')">
	      				<button>삭제</button>
	      			</a>
      			</c:if>
      				<a href="/board/list"><button>목록</button></a>
      		</td>
      	</tr>
      </table>
   </div>
</body>
</html>