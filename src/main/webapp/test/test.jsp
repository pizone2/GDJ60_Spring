<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Remove Test</h1>
	<div id="result">
		<c:forEach begin="0" end="4" var="i" varStatus="j">
			<div id="p${j.index}" class="items">
				<h3>${i} </h3>
				<button class="dels" data-div-id="p${j.index}">DELETE</button>
			</div>
		
		</c:forEach>

	</div>
	<button id="deleteAll">DELETEALL</button>

	<script>

		const dels = document.getElementsByClassName("dels");
		const deleteAll = document.getElementById("deleteAll")
		const result = document.getElementById("result")

		deleteAll.addEventListener("click",function(){
			console.log("test");
			let items = document.getElementsByClassName("items")
			

			for(let i=0;i<items.length;){
				items[0].remove;
			}
		})
		
		for(let i=0;i<dels.length;i++) {
			dels[i].addEventListener("click",function(){
				// document.getElementById("p"+i).remove();
				console.log(this.getAttribute('data-div-id'));
				let id =  this.getAttribute('data-div-id');
				document.getElementById(id).remove();	
			})		
		}


	</script>
	
<!-- ... -->
</body>
</html>