<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container -fluid my-5 ">
		
		<div class="row mb-4 ">
			<h1 class="col-md-7 mx-auto text-center pb-4">Bankbook Add</h1>
		</div>
	
		
			<form action="./add" method="post">
			<div class="row col-md-7 mx-auto">
				
				
				<div class="mb-3">
				    <label for="bookName" class="form-label">상품명</label>
				    <input type="text" class="form-control" id="InputbookName" placeholder="상품명 입력">
			    </div>
			    
			    <div class="mb-3">
				    <label for="bookRate" class="form-label">이자율</label>
				    <input type="text" class="form-control" id="InputbookRate" placeholder="이자율 입력">
			    </div>
				
				<div class="mb-3">
				  <label for="bookDetail" class="form-label">상세정보</label>
				  <textarea class="form-control" id="FormControlbookDetail" placeholder="상세정보 입력" rows="3"></textarea>
				</div>
				
				<fieldset>
					<legend class="fs-6">판매여부</legend>
					<select class="form-select"  name="bookSale">
						<option value="1">판매</option>
						<option selected value="0">판매중단</option><!--selected 선택 초기값  -->
					</select>
				</fieldset>
			</div>
			
			<div class="row col-md-7 mx-auto my-5">
		
			<!-- <input type="submit" value="등록" > -->
			
			<fieldset>
			<button type="submit" class="btn btn-outline-secondary">등록</button>
			</fieldset>
			</div>
			
			
		
		</form>
</div>		
<c:import url="../template/common_css.jsp"></c:import>
</body>
</html>