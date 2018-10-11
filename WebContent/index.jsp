<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Build Blog</title>
</head>
<body>
	<h1>Build Blog</h1>
	<a href="" >Home</a>
	<a href="" >Novo Post</a>
	<a href="" >Sobre</a>
	
	<form action="controller" method="post">
		<label for="pesquisa">Pesquisa</label>
		<input id="pesquisa" type="text" name="pesquisa"/>
	</form>
	
	<c:if test="${not empty USUARIO }">
		
		<c:if test="${not empty LISTPOST }">
		<c:forEach var="post" items="${LISTPOST}" >
			<div class="post">
				<h3>${post.getTitulo()}</h3>
				<p>${post.getNoticia()}</p>		
			</div>
			
		</c:forEach>
		
		</c:if>
	</c:if>
	
</body>
</html>