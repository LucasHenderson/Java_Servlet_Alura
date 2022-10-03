<!DOCTYPE html>

<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
	<%
	List<Empresa> lista = (List<Empresa>) request.getAttribute("listaEmpresas");

	for (Empresa empresa : lista) {
	%>
	<li><%= empresa.getNome() %></li>
	<%
	}
	%>
</ul>

</body>
</html>