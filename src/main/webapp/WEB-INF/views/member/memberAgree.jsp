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
<div class="container-fluid">
		<div class="row col-md-6 mx-auto my-5">
			
			<div class="form-check">
			  <input class="form-agrees" type="checkbox" value="" id="checkAll">
			  <label class="form-check-label" for="checkAll">
			    전체동의
			  </label>
			</div>
			<div class="form-check">
			  <input class="agrees" type="checkbox" value="" id="check1" >
			  <label class="form-check-label" for="check1">
			    동의1
			  </label>
			 </div>
			  <div class="form-check">
			  <input class="agrees" type="checkbox" value="" id="check2" >
			  <label class="form-check-label" for="check2">
			    동의2
			  </label>
			  </div>
			  <div class="form-check">
			  <input class="agrees" type="checkbox" value="" id="check3" >
			  <label class="form-check-label" for="check3">
			    동의3
			  </label>
			</div>
			
			<div>
				<button class="btn btn-primary" id="btn">회원가입</button>
			</div>
			
		</div>
</div>



<script type="text/javascript" src="../resources/js/agree.js"></script>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>