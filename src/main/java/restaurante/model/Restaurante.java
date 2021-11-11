package restaurante.model;

import restaurante.DAO.RestauranteDAO;

public class Restaurante{
		
	public String numeroCnpj;
	public String nomeRestaurante;
	public String nomeCategoria;
	public String dataInauguracao;
	
	public Restaurante() {
		super();
	}
	
	public Restaurante(String numeroCnpj, String nomeRestaurante,String nomeCategoria,String dataInauguracao) {
		this.numeroCnpj = numeroCnpj;
		this.nomeRestaurante = nomeRestaurante;
		this.nomeCategoria = nomeCategoria;
		this.dataInauguracao = dataInauguracao;
	}
	
	public String getNumeroCnpj() {
		return numeroCnpj;
	}

	public void setNumeroCnpj(String numeroCnpj) {
		this.numeroCnpj = numeroCnpj;
	}
	
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	public String getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(String dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

}
