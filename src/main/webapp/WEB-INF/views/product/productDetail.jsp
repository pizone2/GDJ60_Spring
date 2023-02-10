<%@page import="com.iu.si.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Detail</h1>
	<% ProductDTO productDTO =(ProductDTO)request.getAttribute("dto"); %>

	<h3><%= productDTO.getProductName() %></h3>
	<h3><%= productDTO.getProductDetail() %></h3>
	
	<hr>
	<h3>${requestScope.dto.productName}</h3>
	<h3>${dto.getProductDetail()}</h3>
	<h3>${dto.productScore * dto.productNum}</h3>
	

</body>
</html>