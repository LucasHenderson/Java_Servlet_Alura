<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
	<c:forEach items="${ listaEmpresas }" var="empresa">
		<li>
		${ empresa.nome } - 
		<fmt:formatDate value="${ empresa.dataDeAbertura }" pattern="dd/MM/yyyy"/>
		</li>
	</c:forEach>
</ul>

</body>
</html>