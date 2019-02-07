package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;

public class TesteMap {
	public static void main(String [] args) {
		Map<String, Cargo> mapa = new HashMap<String, Cargo>();
		mapa.put("1", new Cargo("DEV", 3000, "Trainee"));
		mapa.put("2", new Cargo("DEV", 5000, "Junior"));
		mapa.put("3", new Cargo("DEV", 8000, "Pleno"));
		
		System.out.println(mapa);
		System.out.println("Chaves: " + mapa.keySet());
		double num = Double.parseDouble(JOptionPane.showInputDialog("valor"));
		for(Cargo c : mapa.values()) {
			if(c.getSalario()>num) {
				System.out.println("Dados: " + c.getNome() + " " + c.getNivel());
			}
		}
		Cargo objeto = mapa.get(JOptionPane.showInputDialog("Chave"));
		System.out.println(objeto.getNivel());
	}
}
