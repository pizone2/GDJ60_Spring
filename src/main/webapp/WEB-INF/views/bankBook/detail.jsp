<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Page</h1>
	<c:if test="${not empty dto}">
	<h3>Number : ${dto.bookNumber }</h3>
	<h3>Title : ${dto.bookName }</h3>
	<h3>Detail : ${dto.bookDetail }</h3>
	<h3>Rate : ${dto.bookRate }</h3>
	<h3>Sale : ${dto.bookSale }</h3>
	<a href="./delete?bookNumber${dto.bookNumber}">상품삭제</a>
	</c:if>
	
	<c:if test="${empty dto}">
			<h3>존재하지 않는 상품입니다.</h3>
	</c:if>
	<a href="./update?bookNum=${dto.bookNumber">상품수정</a>
	
	<a href="./list">목록으로</a>
	
	
</body>
</html>