package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.conexoes.Conexao;

public class ProdutoDAO {
	
	public Connection minhaConexao;
	
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new Conexao().conexao();
		
	}
	
	//Insert (Insert)
	public String inserir(Produto produto) {
		PreparedStatement stmt = minhaConexao
		
		return "Produto cadastrado com sucesso!";
	}

}
