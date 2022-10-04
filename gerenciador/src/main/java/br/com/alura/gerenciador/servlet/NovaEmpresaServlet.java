package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nomeEmpresa");
		String dataDeAbertura = request.getParameter("dataDeAbertura");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		try {
			empresa.setDataDeAbertura(sdf.parse(dataDeAbertura));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		banco.adicionar(empresa);
		
		request.setAttribute("nomeEmpresa", nomeEmpresa);
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		rd.forward(request, response);
	}

}
