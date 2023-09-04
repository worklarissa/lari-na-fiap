package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cliente objetoCliente = new Cliente ();
	
	//Entrada
	objetoCliente.setNome("Larissa Lopes");
	
	objetoCliente.setIdade (19);
	
	objetoCliente.setValor(30);
	
	
	//Saida
	System.out.println("Nome:" + objetoCliente.getNome() + 
			"\nIdade" + objetoCliente.getIdade() );
	
	
	
	
	System.out.println(objetoCliente.getValor());
	
	}

}
