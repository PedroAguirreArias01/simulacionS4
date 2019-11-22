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
@Table(name = "platos")
public class Plato {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo_plato")
	@Enumerated(value = EnumType.STRING)
	private TipoPlato tipoPlato;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private BigDecimal precio;
	@Column(name = "tiempo_coccion")
	private Long tiempoCoccion;
	
	public Plato() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoPlato getTipoPlato() {
		return tipoPlato;
	}

	public void setTipoPlato(TipoPlato tipoPlato) {
		this.tipoPlato = tipoPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Long getTiempoCoccion() {
		return tiempoCoccion;
	}

	public void setTiempoCoccion(Long tiempoCoccion) {
		this.tiempoCoccion = tiempoCoccion;
	}
	
	
}
