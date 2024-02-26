package br.com.fiap.beans;

public class Cliente {

	//Visibilidade, tipo de dados e variaveis
	private int codigo;
	private String nome;
	private String rg;
	private double renda;
	
	
	public Cliente(int codigo, String nome, String rg, double renda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.rg = rg;
		this.renda = renda;
	}


	public Cliente() {
		super();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public double getRenda() {
		return renda;
	}


	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	
	
}
