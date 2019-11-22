package com.simulacionS4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden_personal")
public class OrdenPersonal {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "plato_ordenado")
	private PlatoOrdenado platoOrdenado;
	@Column(name = "orden")
	private Orden orden;
	
	public OrdenPersonal() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PlatoOrdenado getPlatoOrdenado() {
		return platoOrdenado;
	}

	public void setPlatoOrdenado(PlatoOrdenado platoOrdenado) {
		this.platoOrdenado = platoOrdenado;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	
	
}
