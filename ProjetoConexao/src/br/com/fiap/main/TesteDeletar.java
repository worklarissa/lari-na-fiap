package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Produto objProduto = new Produto ();
		
		ProdutoDAO dao = new ProdutoDAO();
		
		objProduto.setCodigo(inteiro("Informe o codigo do produto"));
		
		System.out.println(dao.deletar(objProduto));
		
		
	}

}
