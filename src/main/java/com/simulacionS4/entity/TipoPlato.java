package com.simulacionS4.entity;

public enum TipoPlato {

	ENTRADA("enum.plato.entrada"), PLATO_FUERTE("enum.plato.plato_fuerte"), POSTRE("enum.plato.postre");
	private String codigoMensaje;

	private TipoPlato(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	
}
