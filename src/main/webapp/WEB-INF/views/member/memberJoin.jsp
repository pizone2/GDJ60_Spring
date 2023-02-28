<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<c:import url="../template/common_css.jsp"></c:import>
  <style>
     
      .redResult{  /*검증성공메세지*/
        color: red;
      }
      .blueResult{
        color: blue;
      }

  </style>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container -fluid my-5  ">		 
	<h1 class="text-center">Member Join</h1>
	<div class="col-6 my-4  mx-auto">
		<form action="./memberJoin" method="post" id="frm">
		
		<!--id  -->
		 <div class="form-outline mb-4">
      <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
          <input type="text" id="id" class="form-control" name="id">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">ID</label>
        
      <div id="idError" class="error"></div>
    <!--pw  -->
		 <div class="form-outline mb-4">
       <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
          <input type="text" id="pw" class="form-control" name="pw">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">PW</label>
      
          <div id="pwError" class="error"></div>
        <!--pwCheck  -->
      <div class="form-outline mb-4">
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
        <input type="text" id="pwCheck" class="form-control" name="pwCheck">
        <label class="form-label" for="form1Example1" style="margin-left: 0px;">PwCheck</label>
        
        <div id="pwCheckError" class="error"></div>
        <!--MemberName-->
	    <div class="form-outline mb-4">
        <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
          <input type="text" id="memberName" class="form-control" name="memberName">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">Name</label>
       
          <div id="nameError" class="error"></div> 
          <!-- MemberPhone input -->
        <div class="form-outline mb-4">
          <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 88px;"></div><div class="form-notch-trailing"></div></div></div>
          <input type="text" id="memberPhone" class="form-control" name="memberPhone">
          <label class="form-label" for="form1Example1" style="margin-left: 0px;">Phone Number</label>
         
          <div id="phoneError" class="error"></div>
        <!-- Email input -->
        <div class="form-outline mb-4">
          <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 61.6px;"></div><div class="form-notch-trailing"></div></div></div>
          <input type="text" id="email" class="form-control" name="email">
          <label class="form-label" for="form1Example2" style="margin-left: 0px;">Email</label>
         
          <div id="emailError" class="error"></div>
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
            <a href="#!">Forgot password?</a>
          </div>
          <!-- Simple link -->
        </div>

        <!-- Submit button -->
        <button type="submit" id="btn" class="btn btn-primary btn-block">Sign in</button>
		
	
		</form>
	</div>
	
</div>
<script type="text/javascript" src="../resources/js/memberJoin.js"></script>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>

