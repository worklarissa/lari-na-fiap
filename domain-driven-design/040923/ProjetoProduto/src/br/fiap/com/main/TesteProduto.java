package br.fiap.com.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {

	public static void main(String[] args) {

		Produtp objetoProduto = new Produto ();
	
		//Entrada
		objetoProduto.setTipo (JOptionPane.showInputDialog("Digite o tipo de Produto"));
		
		objetoProduto.setMarca (JOptionPane.showInputDialog("Digite a marca do Produto"))
		
		objetoProduto.setQuantidade (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos")))
		
		objetoProduto.setValor ("15000")
		
		//Saida
		System.out.println ("Tipo:"	+ objetoProduto.getTipo() + 
				"/nMarca:"  + objetoProduto.getMarca()+
				"/nQuantidade:" + objetoProduto.getQuantidade()+
				"/nValor:" + objetoProduto.getValor());
				
	
	}

	
}
