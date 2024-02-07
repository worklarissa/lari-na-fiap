package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		//preparar posições
		Produto[] vetorProduto = new Produto[2];
		
		//controle de posições
		int indice = 0;
		
		//Entrada
		do {
			
			vetorProduto[indice] = new Produto;
			vetorProduto[indice].setCodigo(inteiro("Digite o código do Produto"));
			vetorProduto[indice].setTipo(texto("Digite o tipo do produto"));
			vetorProduto[indice].setMarca(texto("Digite a marca"));
			vetorProduto[indice].setPreco(real("Digite o preço do Produto"));
			
		} while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?",
				"CARRINHO DE COMPRAS",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) ==0);

		//saidas
		for (int contador = 0; contador < indice; contador ++ ) {
			
			System.out.println("\n\nCodigo: " + vetorProduto[contador].getCodigo() +
					"\nTipo: " + vetorProduto[contador].getTipo() +
					"\nMarca: " + vetorProduto[contador].getMarca() + 
					"\nPreco: " + vetorProduto[contador].getPreco()
					);
		}
	
	}

}
