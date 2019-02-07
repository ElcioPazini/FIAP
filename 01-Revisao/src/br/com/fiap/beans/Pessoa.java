package br.com.fiap.beans;

import java.util.Calendar;

public class Pessoa {
	public static final char ESPECIE_HUMANA = 'h';
	private String nome;
	private Calendar nascimento;
	private Genero sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public Genero getSexo() {
		return sexo;
	}
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}
	
}
