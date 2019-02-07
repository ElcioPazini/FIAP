package br.com.fiap.beans;

import java.io.Serializable;

public class Cargo implements Comparable<Cargo>, Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private double salario;
	private String nivel;
	
	/*public int compareTo(Cargo outro) {
		if(this.salario<outro.salario) {
			return -1;
		}else if(this.salario==outro.salario) {
			return 0;
		}else {
			return 1;
		}
	}*/
	
	public int compareTo(Cargo outro) {
		return this.nome.compareTo(outro.nome);
	}
	
	public Cargo(String nome, double salario, String nivel) {
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}
	public Cargo() {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
}
