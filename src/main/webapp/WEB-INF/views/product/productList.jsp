<%@page import="com.iu.si.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List" %>

    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
<link rel="stylesheet" href="/resources/css/table.css">

</head>
<body>
<c:import url="../template/header.jsp"></c:import>
 
	

	
	<div class="title">
	<h1>product list page 입니당</h1>
   
	</div>
	
	<table class="title table-hover" >
	
		<thead>
			 <tr>
			  	<th>상품명</th>
			  	<th>상품평점</th>
			 </tr>
		</thead>
		<tbody class="table-group-divider">
				
			<c:forEach items="${list}" var="dto"> <!-- dto는 page 영역에 담긴다 -->
			
				<tr>
					<td><h3> <a href="./detail?productNum=${dto.productNum}">${pageScope.dto.productNum}</a></h3></td>
					<td class="tb1_td"><h3>${ pageScope.dto.productName}</h3></td>
					<td class="tb1_td"><h3>${ dto.productScore}</h3></td>
				</tr>
			
			</c:forEach>
			
		
				
				
				
		</tbody>s
	</table>
	<a href="./productAdd">상품등록</a>
	 
</body>
</html>