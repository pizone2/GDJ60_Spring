<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberUpdate</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container-fluid">
		<div class="row">
			<h1>MemberUpdate Page</h1>
		</div>
		
		<div class="row">
			<form action="./memberUpdate" method="post">
				
				
				<div class="mb-3">
					<label for="memberName" class="form-label fw-bold">이름</label> 
					<input type="text" name="memberName" class="form-control" id="memberName" value="${dto.memberName}">
				</div>
			
				<div class="mb-3">
					<label for="memberPhone" class="form-label fw-bold">전화번호</label> 
					<input type="tel" name="memberPhone" class="form-control" id="memberPhone" value="${dto.memberPhone}">
				</div>
				
				<div class="mb-3">
					<label for="email" class="form-label fw-bold ">이메일</label> 
					<input type="email" name="email" class="form-control" id="email" value="${dto.email}">
				</div>
				
				<div class="mb-3">
				<button class="btn btn-outline-success fw-bold" type="submit">확인</button> 
			</div>
				
			</form>		
		</div>
	</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>