package com.generations.qtmeats.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_comida")
public class TipoComida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //para autoincrementables
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;

	public TipoComida() {
	}

	public TipoComida(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "tipoComida [id=" + id + ", tipo=" + tipo + "]";
	}

}
