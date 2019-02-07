package br.com.descanso.bo;

import br.com.descanso.beans.Produto;
import br.com.descanso.dao.ProdutoDAO;

public class ProdutoBO {
	public String novoProduto(Produto prod) throws Exception{
		ProdutoDAO dao=new ProdutoDAO();
		
		Produto prod2 = dao.consultarPorNumero(prod.getCodigo());
		if(prod2.getCodigo()>0) {
			return "Codigo de produto já existe";
		}
		if(prod.getCodigo()>99999 || prod.getCodigo()==0) {
			return "Codigo invalido";
		}
		if(prod.getDescricao().length()>50) {
			return "Nome grande demais";
		}
		if(prod.getValor()>9999999) {
			return "Valor muito alto";
		}
		String resp = dao.gravarProd(prod);
		dao.close();
		return resp;
	}
	
	public String atualizarValores(int pNumero) throws Exception{
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto prod = dao.consultarPorNumero(pNumero);
		Produto prod2 = dao.consultarPorNumero(prod.getCodigo());
		if((prod2.getCodigo())==0) {
			return "Produto nao existe";
		}
		
		int resp = dao.depreciar(prod.getCodigo());
		dao.close();
		if(resp==1) {
			return "Atualizado com sucesso";
		}else {
			return "Deu ruim";
		}
	}
	
	public String alterarProduto(int pNumero, String pNome, double pValor) throws Exception{
		ProdutoDAO dao = new ProdutoDAO();
		
		int resp = dao.atualizar(pNumero, pNome, pValor);
		dao.close();
		if(resp==1) {
			return "Alterado com sucesso";
		} else {
			return "Deu ruim";
		}
	}
	
	public String deletarProduto(int pNumero) throws Exception{
		ProdutoDAO dao = new ProdutoDAO();
		int resp = dao.apagar(pNumero);
		dao.close();
		if(resp==1) {
			return "Deletado com sucesso";
		} else {
			return "Deu ruim";
		}
	}
}
