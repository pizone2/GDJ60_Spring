<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<div class="container-fluid">
		<div>
			<h1>Member Page</h1>
		</div>
		
		<div class="row">
			<h3>Name : ${dto.memberName}</h3>
			<h3>Phone : ${dto.memberPhone}</h3>
			<h3>Email : ${dto.email}</h3>
			<h3>Role : ${dto.roleDTO.roleName}</h3>
			
			<a href="./memberUpdate" class="btn btn-info">정보수정</a>
		</div>
	</div>



	<h1>Member Page</h1>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>