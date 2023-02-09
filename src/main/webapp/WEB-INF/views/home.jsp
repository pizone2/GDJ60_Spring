<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/main.css">
</head>
<body>
<h1>
	Hello world!  
</h1>
<a class="c1" href ="./product/list?num=1&num=2&num=3">ProductList</a>
<a class="c1" href ="/product/list">ProductList</a>
<a class="c1" href ="./member/join">MemberJoin</a>
<a class="c1" href = "/bankBook/list">BankBookList</a>
<a class="c1" href = "./bankBook/list">BankBookList</a>
<iframe width="560" height="315" src="https://www.youtube.com/embed/01ZEeF8K3Os" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<img alt="크리스" src="/resources/images/bum.jpg"> <!-- src-이미지의 경로입력 -->
<img alt="범" src="./resources/images/cris.jpg">
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
