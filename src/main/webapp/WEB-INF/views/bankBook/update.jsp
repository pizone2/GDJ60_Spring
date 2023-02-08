<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품수정 Page</h1>
	
	<form action="./update" method="post">
			상품명
			<input type="text" name="bookName" value="${dto.bookName}" placeholder="제품명 입력">
			이자율
			<input type="text" name="bookRate" value="${dto.bookRate}">
			상품정보
			<textarea rows="" cols=""  name="bookDetail">${dto.bookDetail}</textarea> 
			할인율
			<input type="text" name="bookSale"value="${dto.bookSale}">
			전송버튼
			<input type="submit" value="수정" >
			<button type ="submit">등록</button>
	</form>
</body>
</html>