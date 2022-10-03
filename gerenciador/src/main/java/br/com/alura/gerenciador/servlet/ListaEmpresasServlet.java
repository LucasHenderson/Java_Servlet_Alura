package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getListaDeEmpresas();
		
		//guarda os atributos
		request.setAttribute("listaEmpresas", lista);
		
		//fala para onde esses atributos vao
		RequestDispatcher rd = request.getRequestDispatcher("/listaDeEmpresas.jsp");
		
		//envia esses atributos
		rd.forward(request, response);
	}

}
