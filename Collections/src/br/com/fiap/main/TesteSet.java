package br.com.fiap.main;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	public static void main (String [] args) {
		Set<String> cargos = new HashSet<String>();
		cargos.add("DBA");
		cargos.add("DEV");
		cargos.add("DBA");
		System.out.println(cargos);
		cargos.contains("DEV");
	}
}
