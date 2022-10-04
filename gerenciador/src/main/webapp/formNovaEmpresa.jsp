<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkNovaEmpresaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${ linkNovaEmpresaServlet }" method="post">
		Nome: <input type="text" name="nomeEmpresa"/>
		
		Data de abertura: <input type="date" name="dataDeAbertura" pattern="dd-MM-yyyy"/>
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>