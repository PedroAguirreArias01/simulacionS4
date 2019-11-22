package com.simulacionS4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "pago")
public class Pago {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "total_pago")
	private BigDecimal totalPago;
	@Column(name = "tipo_pago")
	@Enumerated(value = EnumType.STRING)
	private TipoPago tipoPago;
	
	public Pago() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(BigDecimal totalPago) {
		this.totalPago = totalPago;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	
	
}
