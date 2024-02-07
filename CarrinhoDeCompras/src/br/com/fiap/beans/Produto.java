package br.com.fiap.beans;

public class Produto {

	//visibilidade,tipo de dado e variaveis
	private int codigo;
	private String tipo;
	private String marca;
	private double preco;
	
	public Produto() {
		super();
	}

	public Produto(int codigo, String tipo, String marca, double preco) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
