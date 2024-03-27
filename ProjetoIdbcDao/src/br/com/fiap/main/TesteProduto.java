package br.com.fiap.main;

import java.sql.Connection;


public class TesteProduto {

	public static void main(String[] args) {
		
		Connection cn = new ConexaoFactory().conexao();
		
		System.out.println("Conectado com o Banco");
		
		cn.close();
		
		
	}

}
