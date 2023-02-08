<%@page import="com.iu.si.product.ProductDTO"%>
<%@page import="java.util.List"%>
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
		<h3><%= productDTO.getProductScore() %></h3>
	<%} %>
	
	<hr>
	<div class="col-6">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>상품명</th><th>평점</th>
			</tr>
		</thead>
		
		<tbody>
			<!--반복문-->
			<c:forEach items = "${list}" var = "dto">
			<!--list에 있는거 하나 꺼내서 dto에 담음, dto는 page영역에 담김
			현재 jsp영역에서만 사용하는것이 page  -->
				<tr>
					<td><a href = "./detail?productNum=${dto.productNum }">${pageScope.dto.productName}</a></td>
					<td>${dto.productScore}</td>
				<tr>
			</c:forEach>
		</tbody>
	</table>
		<a class="btn btn-danger" href="./productAdd">상품등록</a>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>