<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href ="./product/list?num=1&num=2&num=3">ProductList</a>
<a href ="/product/list">ProductList</a>
<a href ="./member/join">MemberJoin</a>
<a href = "/bankBook/list">BankBookList</a>
<a href = "./bankBook/list">BankBookList</a>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
