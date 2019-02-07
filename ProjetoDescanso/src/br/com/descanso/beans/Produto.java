package br.com.descanso.beans;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	
	public Produto(int codigo, String descricao, double valor) {
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
	}
	
	public Produto() {}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
}
