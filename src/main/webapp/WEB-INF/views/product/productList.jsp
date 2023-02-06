<%@page import="com.iu.si.product.ProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
	
	<h1>Product List</h1>
	<% 
		List<ProductDTO> ar = (List<ProductDTO>)request.getAttribute("list");
		for(ProductDTO productDTO:ar){
			
		
	
	%>
		<h3><%= productDTO.getProductName() %></h3>
		<h3><%= productDTO.getProductJumsu() %></h3>
	<%} %>
	
	<hr>
	<div class="col-6">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>��ǰ��</th><th>����</th>
			</tr>
		</thead>
		
		<tbody>
			<!--�ݺ���-->
			<c:forEach items = "${list}" var = "dto">
			<!--list�� �ִ°� �ϳ� ������ dto�� ����, dto�� page������ ���
			���� jsp���������� ����ϴ°��� page  -->
				<tr>
					<td><a href = "./detail?productNum=${dto.productNum }">${pageScope.dto.productName}</a></td>
					<td>${dto.productJumsu}</td>
				<tr>
			</c:forEach>
		</tbody>
	</table>
		<a class="btn btn-danger" href="./productAdd">��ǰ���</a>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>