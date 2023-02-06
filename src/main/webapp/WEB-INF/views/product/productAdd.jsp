<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Add</h1>
	<div class="col-6">
		<form action="./productAdd" method="post">
			상품명
			<input type="text" name="productName" value="test">
			상품정보
			<textarea name="productDetail" rows="" cols=""></textarea>
			전송버튼
			<button type="submit">등록</button>
			
		</form>
	</div>
</body>
</html>