package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.beans.Genero;
import br.com.fiap.beans.Pessoa;

public class Teste {
	public static void main (String [] args) {
		Pessoa p = new Pessoa();
		p.setSexo(Genero.MASCULINO);
		p.setNome("jailson");
		Calendar data = Calendar.getInstance(); //SYSDATE
		Calendar data2 = new GregorianCalendar(2000, Calendar.JANUARY, 20); //INSERT DE DATA
		
		p.setNascimento(data);
		//FORMATAR DATA PARA EXIBIR
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data.getTime()) + "\n" + sdf.format(data2.getTime()));
	}
}
