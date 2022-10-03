package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaDeEmpresas = new ArrayList<Empresa>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Lucas");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Henderson");
		
		Banco.listaDeEmpresas.add(empresa1);
		Banco.listaDeEmpresas.add(empresa2);
	}
	
	public void adicionar(Empresa empresa) {
		listaDeEmpresas.add(empresa);
	}
	
	public List<Empresa> getListaDeEmpresas(){
		return Banco.listaDeEmpresas;
	}

}
