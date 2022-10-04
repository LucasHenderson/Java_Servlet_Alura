<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty nomeEmpresa }">
		Empresa ${ nomeEmpresa } cadastrada com sucesso!
	</c:if>
	
	<c:if test="${ empty nomeEmpresa }">
		Nenhuma empresa foi cadastrada!
	</c:if>
</body>
<!-- 

<c:forEach var="i" begin="1" end="10" step="2">
  ${i} <br />
</c:forEach>

 -->
</html>