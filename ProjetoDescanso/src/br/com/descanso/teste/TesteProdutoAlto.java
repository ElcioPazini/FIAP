package br.com.descanso.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.descanso.beans.Produto;
import br.com.descanso.dao.ProdutoDAO;
import br.com.descanso.excecao.Excecao;

public class TesteProdutoAlto {
	public static void main (String [] args) {
		try {
			ProdutoDAO dao=new ProdutoDAO();
			List<Produto> produtos = new ArrayList<Produto>();
			produtos=dao.getProdutoAlto(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
			for(Produto prod : produtos) {
				System.out.println(prod.getCodigo());
				System.out.println(prod.getDescricao());
				System.out.println(prod.getValor());
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
