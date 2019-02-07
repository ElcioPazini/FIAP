package br.com.descanso.teste;

import javax.swing.JOptionPane;

import br.com.descanso.beans.Produto;
import br.com.descanso.bo.ProdutoBO;
import br.com.descanso.dao.ProdutoDAO;

public class TesteGravarProd {
	public static void main (String [] args) {
		try {
			ProdutoBO bo = new ProdutoBO();
			//Produto prod = new Produto( Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
				//						JOptionPane.showInputDialog("Descrição"), 
					//					Double.parseDouble(JOptionPane.showInputDialog("Valor")));
										
			//System.out.println(bo.novoProduto(prod));
			System.out.println(bo.deletarProduto(Integer.parseInt(JOptionPane.showInputDialog("Codigo produto"))));
			
		}catch(Exception e){
			
		}
	}
}
