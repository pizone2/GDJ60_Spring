<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bankbook Add</h1>
	
	<div class="col-6">
		<form action="./add" method="post">
			상품명
			<input type="text" name="bookName" placeholder="제품명 입력">
			이자율
			<input type="text" name="bookRate">
			상품정보
			<textarea rows="" cols=""  name="bookDetail"></textarea> 
			할인율
			<input type="text" name="bookSale">
			전송버튼
			<!-- <input type="submit" value="등록" > -->
			<button type ="submit">등록</button>
		
		</form>
	</div>

</body>
</html>