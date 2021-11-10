package com.br.ifood;

public class ContaUsuario {
	private int idUsuario;
	private String senhaUsuario;
	
	
	public int getLogar() {
		return idUsuario;
	}
	
	public void setLogar (int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getsenhaUsuario() {
		return senhaUsuario;
	}
	
	public void setsenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
}
