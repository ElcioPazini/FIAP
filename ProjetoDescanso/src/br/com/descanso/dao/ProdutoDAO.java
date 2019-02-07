package br.com.descanso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.descanso.beans.Produto;
import br.com.descanso.conexao.Conexao;

public class ProdutoDAO {
	private Connection con;
	private ResultSet rs;
	private PreparedStatement stmt;
	
	public ProdutoDAO() throws Exception{
		con=Conexao.conectar();
	}
	
	public Produto consultarPorNumero(int pNumero) throws Exception{
		stmt=con.prepareStatement("SELECT * FROM T_DDD_PRODUTO WHERE CD_PRODUTO=?");
		stmt.setInt(1, pNumero);
		rs=stmt.executeQuery();
		Produto prod = new Produto();
		if (rs.next()) {
			prod= new Produto(rs.getInt("CD_PRODUTO"), rs.getString("DS_PRODUTO"), rs.getDouble("VL_PRODUTO"));
		}
		return prod;
	}
	
	public String gravarProd(Produto prod) throws Exception{
		stmt=con.prepareStatement("INSERT INTO T_DDD_PRODUTO (CD_PRODUTO, DS_PRODUTO, VL_PRODUTO) VALUES (?, ?, ?)");
		stmt.setInt(1, prod.getCodigo());
		stmt.setString(2, prod.getDescricao());
		stmt.setDouble(3, prod.getValor());
		stmt.executeQuery();
		con.close();
		return "Cadastro feito com sucesso";
	}
	
	public List<Produto> getProdutoAlto (double pValor) throws Exception{
		List<Produto> produtos = new ArrayList<Produto>();
		stmt=con.prepareStatement("SELECT * FROM T_DDD_PRODUTO WHERE VL_PRODUTO > ?");
		stmt.setDouble(1, pValor);
		rs=stmt.executeQuery();
		while(rs.next()) {
			produtos.add(new Produto(rs.getInt("CD_PRODUTO"), rs.getString("DS_PRODUTO"), rs.getDouble("VL_PRODUTO")));
		}
		return produtos;
	}
	
	public int atualizar(int pNumero, String pNome, double pValor) throws Exception{
		stmt=con.prepareStatement("UPDATE T_DDD_PRODUTO SET DS_PRODUTO=?, VL_PRODUTO=? WHERE CD_PRODUTO=?");
		stmt.setString(1, pNome);
		stmt.setDouble(2, pValor);
		stmt.setInt(3, pNumero);
		return stmt.executeUpdate();
	}
	
	public int apagar(int pNumero) throws Exception{
		stmt=con.prepareStatement("DELETE FROM T_DDD_PRODUTO WHERE CD_PRODUTO=?");
		stmt.setInt(1, pNumero);
		return stmt.executeUpdate();
	}
	
	public int depreciar(int pNumero) throws Exception{
		stmt=con.prepareStatement("UPDATE T_DDD_PRODUTO SET VL_PRODUTO=VL_PRODUTO*0.97 WHERE CD_PRODUTO=?");
		stmt.setInt(1, pNumero);
		return stmt.executeUpdate();
	}
	
	public void close() throws Exception{
		con.close();
	}
}
















