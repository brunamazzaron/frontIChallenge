package com.br.ifood;

public class Endereco extends ContaUsuario{
	
	public int codigoEndereco;
	public int idRest;
	public int numCep;
	public String logradouro;
	public int restauranteIdRest;
	
	public int getCodigoEndereco () {
		return codigoEndereco;
	}

	public void setCodigoEndereco(int codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}
	public int getIdRest() {
		return idRest;
	}

	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}
	public int getNumCep() {
		return numCep;
	}

	public void setNumCep(int numCep) {
		this.numCep = numCep;
	}
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getRestauranteIdRest() {
		return restauranteIdRest;
	}

	public void setRestauranteIdRest(int restauranteIdRest) {
		this.restauranteIdRest = restauranteIdRest;
	}

}
