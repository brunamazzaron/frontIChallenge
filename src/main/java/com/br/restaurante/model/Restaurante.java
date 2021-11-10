package com.br.restaurante.model;

import com.br.ifood.ContaUsuario;

public class Restaurante extends ContaUsuario{
	
	public int idRestaurante;
	public int codigoCadastro;
	public String dataCadastro;
	public String dataInauguracao;
	public int numeroRestaurante;
	public int numberoCnpj;
	
	
//	public Restaurante() {
//
//	}
//	
//	public Restaurante(String dataCadastro, String dataInauguracao, int idRestaurante, int codigoCadastro, int numeroRestaurante, int numberoCnpj) {
//		this.idRestaurante = idRestaurante;
//		this.codigoCadastro = codigoCadastro;
//		this.dataCadastro = dataCadastro;
//		this.dataInauguracao = dataInauguracao;
//		this.numeroRestaurante = numeroRestaurante;
//		this.numberoCnpj = numberoCnpj;
//	}
//
//	public void Rest(String dataCadastro, String dataInauguracao, int idRestaurante, int codigoCadastro, int numeroRestaurante, int numberoCnpj) {
//		this.idRestaurante = idRestaurante;
//		this.codigoCadastro = codigoCadastro;
//		this.dataCadastro = dataCadastro;
//		this.dataInauguracao = dataInauguracao;
//		this.numeroRestaurante = numeroRestaurante;
//		this.numberoCnpj = numberoCnpj;
//	}

	
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
