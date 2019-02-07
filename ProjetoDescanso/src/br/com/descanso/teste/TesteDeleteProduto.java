package br.com.descanso.teste;

import javax.swing.JOptionPane;

import br.com.descanso.dao.ProdutoDAO;
import br.com.descanso.excecao.Excecao;

public class TesteDeleteProduto {
	public static void main(String [] args) {
		try {
			ProdutoDAO dao=new ProdutoDAO();
			
			System.out.println(dao.apagar(Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto"))));
			
			dao.close();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
