package br.com.fiap.beans;

public class Cliente {

	// tipo de dado,variavel
	private String nome;
	private int idade;
	private double valor;
	

	// Setters (entrada de dado)
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
	

	// Getters (Saída/Exibir)
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public double getValor () {
		return valor;
	}
}
// comentário