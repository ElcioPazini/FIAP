package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class ArquivoStream2 {
	public static void main (String [] args) throws Exception{
		FileOutputStream arquivo = new FileOutputStream("d:/churros.arq");
		ObjectOutputStream dados = new ObjectOutputStream(arquivo);
		List<Cargo> cargos = new ArrayList<Cargo>();
		cargos.add(new Cargo("ANALISTA", 700, "JR"));
		cargos.add(new Cargo("DBA", 1000, "SENIOR"));
		cargos.add(new Cargo("DEV", 30000, "PLENO"));
		cargos.add(new Cargo("FRONT", 700, "JR"));
		dados.writeObject(cargos);
		dados.flush();
		
		FileInputStream arq = new FileInputStream("d:/churros.arq");
		ObjectInputStream objeto = new ObjectInputStream(arq);
		List<Cargo> cargos2 = (List<Cargo>) objeto.readObject();
		for(Cargo p: cargos2) {
			System.out.println(p.getNivel());
			System.out.println(p.getNome());
			System.out.println(p.getSalario());
		}
		objeto.close();
	}
}
