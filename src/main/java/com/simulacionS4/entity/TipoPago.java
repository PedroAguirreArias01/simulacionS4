package com.simulacionS4.entity;

public enum TipoPago {

	TARJETA_CREDITO("enum.pago.tarjeta_credito"), EFECTIVO("enum.pago.efectivo");
	private String codigoMensaje;

	private TipoPago(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
}
