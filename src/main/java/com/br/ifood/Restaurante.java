package com.br.ifood;

public class Restaurante extends ContaUsuario{
	
	public int idRestaurante;
	public int codigoCadastro;
	public String dataCadastro;
	public String dataInauguracao;
	public int numeroRestaurante;
	public int numberoCnpj;
	
	public int getIdRestaurante () {
		return idRestaurante;
	}

	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}
	
	public int getCodigoCadastro() {
		return codigoCadastro;
	}

	public void setCodigoCadastro(int codigoCadastro) {
		this.codigoCadastro = codigoCadastro;
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(String dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}
	
	public int getNumeroRestaurante() {
		return numeroRestaurante;
	}

	public void setNumeroRestaurante(int numeroRestaurante) {
		this.numeroRestaurante = numeroRestaurante;
	}
	
	public int getNumeroCnpj() {
		return numberoCnpj;
	}

	public void setNumeroCnpj(int numberoCnpj) {
		this.numberoCnpj = numberoCnpj;
	}

}
