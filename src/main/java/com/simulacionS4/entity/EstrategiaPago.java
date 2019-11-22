package com.simulacionS4.entity;

public enum EstrategiaPago {

	UNO_POR_TODOS("enum.orden.uno_por_todos"), TODOS_POR_TODOS("enum.orden.todos_por_todos"), AMERICANO("enum.orden.americano");
	private String codigoMensaje;

	private EstrategiaPago(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	
	
}
