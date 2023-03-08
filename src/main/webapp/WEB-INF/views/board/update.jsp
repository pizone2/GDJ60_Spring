<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<c:import url="../template/common_css.jsp"></c:import>
	 <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container -fluid my-5 ">
		
		<div class="row mb-4 ">
			<h1 class="col-md-7 mx-auto text-center pb-4">${boardName} Update Page</h1>
		</div>
	
		
			<form action="./update" method="post" enctype="multipart/form-data" >
			<input type="hidden" name="num" value="${dto.num }">
			
			<div class="row col-md-7 mx-auto">
				
			    <div class="mb-3">
				    <label for="title" class="form-label">제목</label>
				    <input type="text" name="title" class="form-control" value="${dto.title}" id="title" placeholder="제목 입력">
			    </div>
				
				<div class="mb-3">
				  <label for="contents" class="form-label">상세내용</label>
				  <textarea class="form-control" name="contents" id="contents"  placeholder="상세내용 입력" rows="3" value="${dto.contents}"></textarea>
				</div>
				
				<div class="mb-3">
				    <label for="writer" class="form-label">작성자</label>
				  <!--    <input type="text" name="writer" class="form-control" id="writer" placeholder="작성자 입력"> -->
				     <input type="text" name="writer"  readonly value="${dto.writer}"   class="form-control" id="writer" placeholder="작성자 입력"> 
				   <!--   <input type="hidden" name="writer" value="${member.id}">-->
			    </div>
			    
				
				
		 		<div id="fileList" class="my-5">
		 		<button id="add" type="button" class="">ADD</button>
		 			
				<c:forEach items="${dto.boardFileDTOs}" var="fileDTO">
					
					<div class="input-group mb-3">
					  <div class="input-group-text">
					    <input class="form-check-input mt-0 deleteCheck"  type="checkbox" name="fileNum" value="${fileDTO.fileNum}" aria-label="Checkbox for following text input">
					  </div>
					  <input type="text" class="form-control" value="${fileDTO.oriName}" aria-label="Text input with checkbox">
					</div>
					
					</c:forEach>  
					
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
	setParam('addFiles');
	setCount(${dto.boardFileDTOs.size()});
	$("#contents").summernote();
	
</script>
<c:import url="../template/common_css.jsp"></c:import>
</body>
</html>