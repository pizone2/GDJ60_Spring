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
	
<div class="container -fluid my-5  ">		
	<h1 class="text-center">Member Join</h1>
	<div class="col-6 my-4  mx-auto">
		<form action="./memberJoin" method="post">
		<!--id  -->
		 <div class="form-outline mb-4">
          <input type="text" id="ID" class="form-control">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">ID</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
		<!--pw  -->
		 <div class="form-outline mb-4">
          <input type="text" id="PW" class="form-control">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">PW</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
		<!--MemberName-->
	    <div class="form-outline mb-4">
          <input type="text" id="Name" class="form-control">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">Name</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
        <!-- MemberPhone input -->
        <div class="form-outline mb-4">
          <input type="text" id="Phone Number" class="form-control">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">Phone Number</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>

        <!-- Email input -->
        <div class="form-outline mb-4">
          <input type="text" id="Email" class="form-control">
          <label class="form-label" for="form1Example2" style="margin-left: 0px;">Email</label>
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 61.6px;"></div><div class="form-notch-trailing"></div></div></div>

        <!-- 2 column grid layout for inline styling -->
        <div class="row mb-4">
          <div class="col d-flex justify-content-center">
            <!-- Checkbox -->
            <div class="form-check">
              <input class="form-check-input" type="checkbox" value="" id="form1Example3" checked="">
              <label class="form-check-label" for="form1Example3"> Remember me </label>
            </div>
          </div>

          <div class="col">
            <!-- Simple link -->
            <a href="#!">Forgot password?</a>
          </div>
        </div>

        <!-- Submit button -->
        <button type="button" class="btn btn-primary btn-block">Sign in</button>
		
	
		</form>
	</div>
	
</div>	
</body>
</html>

