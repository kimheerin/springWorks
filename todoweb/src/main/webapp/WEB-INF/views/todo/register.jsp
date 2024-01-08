<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo 등록</title>
</head>
<body>
   <div class="container-fluid">
		<jsp:include page="../layout/header.jsp" />
		
      		<!--본문 영역  -->
      		<div class="row content">
		      	<div class="col">
		      		<div class="card">
		      			<div class="card-body">
				     	<h1>등록</h1>
							<form action="/todo/register" method="post">
								<div class="input-groub mb-3">
						            <span class="input-groub-text">할일</span>
						            <input type="text" name="title" class="form-control"
						            	placeholder="Title">
								</div>
							    <div class="input-groub mb-3">
						            <span class="input-groub-text">작성자</span>
						            <input type="text" name="writer" class="form-control"
						            	placeholder="Writer">
							    </div>
						         <p>
						            <input type="submit" class="btn btn-primary" value="등록">
						            <input type="reset" class="btn btn-primary" value="취소">
						         </p>
							</form>
		      			</div>
	      			</div>
      			</div>
      		</div> <!-- 본문 끝 -->
      
      <jsp:include page="../layout/footer.jsp" />
   </div>
</body>
</html>