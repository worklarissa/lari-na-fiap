package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> listaProdutos = (ArrayList<Produto>) dao.selecionar();
		
		if(listaProdutos != null) {
			//foreach
			for(Produto produto : listaProdutos) {
				System.out.println(
						produto.getCodigo()+ " " +
						produto.getTipo()+ " " +
						produto.getMarca()+ " " +
						produto.getValor()+ " " 
						);
			}
		}

	}

}
