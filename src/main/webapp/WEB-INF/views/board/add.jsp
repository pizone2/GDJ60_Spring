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

<div class="container -fluid my-5 ">
		
		<div class="row mb-4 ">
			<h1 class="col-md-7 mx-auto text-center pb-4">${boardName} Add Page</h1>
		</div>
	
		
			<form action="./add" method="post" enctype="multipart/form-data" >
			<div class="row col-md-7 mx-auto">
				
			    <div class="mb-3">
				    <label for="title" class="form-label">제목</label>
				    <input type="text" name="title" class="form-control" id="title" placeholder="제목 입력">
			    </div>
				
				<div class="mb-3">
				  <label for="contents" class="form-label">상세내용</label>
				  <textarea class="form-control" name="contents" id="contents" placeholder="상세내용 입력" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				    <label for="writer" class="form-label">작성자</label>
				  <!--    <input type="text" name="writer" class="form-control" id="writer" placeholder="작성자 입력"> -->
				     <input type="text" name="writer"  readonly value="${member.id}"   class="form-control" id="writer" placeholder="작성자 입력"> 
				   <!--   <input type="hidden" name="writer" value="${member.id}">-->
			    </div>
			    
				
				
		 		<div id="fileList">
					<!-- <div id="divs" class="mb-3">
					<label for="files" class="form-label">Image</label>
					<input type="file" class="form-control" id="files" name="files">
					<button id="btnDel" type="button" >X</button>
					</div>  -->
					<button id="add" type="button">ADD</button>
				</div>
				
				
			
			<div class="row col-md-7 mx-auto my-5">
		
			<!-- <input type="submit" value="등록" > -->
			
			<fieldset>
			<button type="submit" class="btn btn-outline-secondary">글쓰기</button>
			</fieldset>
			</div>
			
			
		
		</form>
</div>		
<script src="../resources/js/fileManager.js"></script>
<script>
	setMax(5);
	setParam('files');
</script>
<c:import url="../template/common_css.jsp"></c:import>
</body>
</html>