package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.beans.Cargo;

public class ArquivoStream {
	public static void main (String [] args) throws Exception{
		FileOutputStream arquivo = new FileOutputStream("d:/churros.arq");
		ObjectOutputStream dados = new ObjectOutputStream(arquivo);
		dados.writeObject(new Cargo("ANALISTA", 700, "JR"));
		dados.flush();
		
		FileInputStream arq = new FileInputStream("d:/churros.arq");
		ObjectInputStream objeto = new ObjectInputStream(arq);
		Cargo c = (Cargo) objeto.readObject();
		System.out.println(c.getNivel());
		System.out.println(c.getNome());
		System.out.println(c.getSalario());
		objeto.close();
	}
}
