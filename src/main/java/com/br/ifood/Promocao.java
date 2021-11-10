package com.br.ifood;

public class Promocao extends ContaUsuario{
	
	public int codigoPromocao;
	public int codigoItem;
	public String dataInicio;
	public String dataFim;
	public int codigoMenu;
	
	public int getCodigoPromocao () {
		return codigoPromocao;
	}

	public void setCodigoPromocao(int codigoPromocao) {
		this.codigoPromocao = codigoPromocao;
	}
	
	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
		public int getCodigoMenu() {
		return codigoMenu;
	}

	public void setCodigoMenu(int codigoMenu) {
		this.codigoMenu = codigoMenu;
	}

}
