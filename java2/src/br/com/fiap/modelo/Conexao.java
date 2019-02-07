package br.com.fiap.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public static void main(String [] args) {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM80152", "191000");
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				
			}
		}
	}
}
