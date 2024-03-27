package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	
	public Connection minhaConexao;
	
	public ProdutoDAO () throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Inserir "))
		
		
	return null;
	}

}
