package com.br.ifood;

public class Pedido extends ContaUsuario{
	
	public int codigoPedido;
	public int quantidadePedido;
	public float formaPagamento;
	public int codigoRastreio;
	public String dataPedido;
	public String horaPedido;
	public int codigoAvaliacao;
	public int codigoPromocao;
	public int codigoMenu;
	
	public int getCodigoPedido () {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public int getQuantidadePedido() {
		return quantidadePedido;
	}

	public void setQuantidadePedido(int quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}
	public float getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(float formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public int getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(int codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	
	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public String getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}
	
	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}
	
	public int getCodigoPromocao() {
		return codigoPromocao;
	}

	public void setCodigoPromocao(int codigoPromocao) {
		this.codigoPromocao = codigoPromocao;
	}
	
	public int getCodigoMenu() {
		return codigoMenu;
	}

	public void setCodigoMenu(int codigoMenu) {
		this.codigoMenu = codigoMenu;
	}

}
