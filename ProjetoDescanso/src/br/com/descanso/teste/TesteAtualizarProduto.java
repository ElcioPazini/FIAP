package br.com.descanso.teste;

import javax.swing.JOptionPane;

import br.com.descanso.dao.ProdutoDAO;
import br.com.descanso.excecao.Excecao;

public class TesteAtualizarProduto {
	public static void main(String [] args){
		try {
			ProdutoDAO dao = new ProdutoDAO();
			System.out.println(dao.atualizar(Integer.parseInt(JOptionPane.showInputDialog("Codigo Produto")),
											 JOptionPane.showInputDialog("Nome Novo"), 
											 Double.parseDouble(JOptionPane.showInputDialog("Valor Novo"))));
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}
}
