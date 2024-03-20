package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoFactory {
	
	public Connection conexao() {
		
		//Metodo Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Conexao
		return DriverManager.getConnection("jdbc")
		
	}

}
