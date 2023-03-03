<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<table class="table table-striped">
<c:forEach items="${list }" var="dto">
	<tr>
		<td>${dto.contents }</td>
		<td>${dto.writer }</td>
		<td>${dto.regDate }</td>
	</tr>
	
</c:forEach>
</table>