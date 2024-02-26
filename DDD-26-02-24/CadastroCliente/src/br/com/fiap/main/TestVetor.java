package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;


public class TestVetor {

	//String 
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	
	//Double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	
	public static void main(String[] args) {
		// Preparar vetor e determinar o maximo de posições
		Cliente[] vetorClientes = new Cliente [2];
		
		int indice =0;
		
		do {
			vetorClientes[indice] = new Cliente();
			vetorClientes[indice].setCodigo(inteiro("Informe o codigo"));
			vetorClientes[indice].setNome(texto("Infome o nome"));
			vetorClientes[indice].setRg(texto("Inorme o RG"));
			vetorClientes[indice].setRenda(real("Informe a renda"));
			

			
			
			
		} while ( JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?",
				"CADASTRO DE CLIENTE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)  ==0);
		
		
		//saída-para vetor utilizamos o for
		for (int contador = 0; contador < indice; contador++ ) {
			System.out.println("\n\nCodigo: " + vetorClientes[contador].getCodigo + 
								"\nNome: " + vetorClientes[contador].getNome() +
								"\nRG: " + vetorClientes[contador].getRg() +
								"\nRenda: " + vetorClientes[contador].getRenda()
								);
		}
		
		
		
		
		
	}
	
	

}
