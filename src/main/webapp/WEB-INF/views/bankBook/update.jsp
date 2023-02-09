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
			
			<input type="hidden" name="bookNumber" value="${dto.bookNumber}">
		
			
			<fieldset>
				<legend>상품명</legend>
				<input type="text" name="bookName" value="${dto.bookName}" placeholder="제품명 입력">
			</fieldset>
				
			<fieldset>
				<legend>이자율</legend>
				<input type="text" name="bookRate" value="${dto.bookRate}">
			</fieldset>
			
			<fieldset>
				<legend>상세정보</legend>
				<textarea rows="" cols=""  name="bookDetail">${dto.bookDetail}</textarea> 
			</fieldset>
			
			<fieldset>
				<legend>할인율</legend>
				<input type="text" name="bookSale"value="${dto.bookSale}">
			</fieldset>
			
			<fieldset>
				<legend>판매여부</legend>
				<label for="bs1">판매</label><!--ford ㅁ 은 id가 ㅁ인 곳으로 간다 -->
				<input id="bs1" type="radio" ${dto.bookSale eq '1'? 'checked':''} checked name="bookSale" value="1">
				<label for="bs1">판매중단</label>
				<input id="bs2" type="radio" ${dto.bookSale eq '0'? 'checked':''} name="bookSale" value="0">
			</fieldset>
			
			<fieldset>
				<legend>판매여부</legend>
				<select name="bookSale">
					<option ${dto.bookSale eq '1'? 'selected':''}  value="1">판매</option>
					<option ${dto.bookSale eq '0'? 'selected':''}   value="0">판매중단</option><!--selected 선택 초기값  -->
				</select>
			</fieldset>
			
			<fieldset>
				<legend>수정</legend>
				<input type="submit" value="수정" >
			</fieldset>
			
			
	</form>
</body>
</html>