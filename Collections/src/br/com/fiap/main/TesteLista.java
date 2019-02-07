package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class TesteLista {
	public static void main(String [] args0) {
		List<Cargo> cargos = new ArrayList<Cargo>();
		cargos.add(new Cargo("DBA", 1000, "senior"));
		cargos.add(new Cargo("ESTAGIARIO", 1500, "senior"));
		cargos.add(new Cargo("ANALISTA", 3000, "JUNIOR"));
		cargos.add(new Cargo("DEV", 10000, "PLENO"));
		Collections.sort(cargos);
		for(Cargo c: cargos) {
			System.out.println(c.getSalario());
			System.out.println(c.getNome());
			System.out.println(c.getNivel());
		}
	}
}
