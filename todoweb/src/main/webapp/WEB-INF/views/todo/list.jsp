<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To-do List</title>
</head>
<body>
   <div class="container-fluid">
      <jsp:include page="../layout/header.jsp" />
      <!--본문 영역  -->
      	<div class="row content">
			<div class="col">
				<div class="card">
            		<div class="card-body">
					<h5 class="card-title">To-do List</h5>
						<table class="table">
							<thead>
							<tr>
								<th>No</th><th>제목</th><th>작성자</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach items="${todoList}" var="todo">
									<tr>
										<td>${todo.tno}</td><td>${todo.title}</td><td>${todo.writer}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
            		</div>
         		</div>
       		</div>
     	</div><!--본문 닫기  -->            
     
		<jsp:include page="../layout/footer.jsp" />
	</div>
</body>
</html>