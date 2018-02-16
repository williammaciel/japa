package br.com.fiap.dao;

import java.sql.Connection;

// Classe abstrata: N�o pode ser instanciado
// PODE ter m�todos abstratos
public abstract class GenericDAO {

	protected Connection conexao;
	
	public abstract void insert(Object tabela);
	
	public void atualizar(Object tabela) {
		
	}
	
}