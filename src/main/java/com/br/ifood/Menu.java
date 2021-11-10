package com.br.ifood;

public class Menu extends ContaUsuario{
	
	public int codigoMenu;
	public int codigoItem;
	public int codigoCombo;
	public String nomeItem;
	public String nomeCombo;
	public float valorPreco;
	public int restauranteIdRest;
	
	public int getCodigoMenu () {
		return codigoMenu;
	}

	public void setCodigoMenu(int codigoMenu) {
		this.codigoMenu = codigoMenu;
	}
	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public int getCodigoCombo() {
		return codigoCombo;
	}

	public void setCodigoCombo(int codigoCombo) {
		this.codigoCombo = codigoCombo;
	}
	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	
	public String getNomeCombo() {
		return nomeCombo;
	}

	public void setNomeCombo(String nomeCombo) {
		this.nomeCombo = nomeCombo;
	}
	
	public float getValorPreco() {
		return valorPreco;
	}

	public void setValorPreco(float valorPreco) {
		this.valorPreco = valorPreco;
	}
	
	public int getRestauranteIdRest() {
		return restauranteIdRest;
	}

	public void setRestauranteIdRest(int restauranteIdRest) {
		this.restauranteIdRest = restauranteIdRest;
	}

}
