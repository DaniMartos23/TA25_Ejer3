package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cajas")//en caso que la tabala sea diferente
public class Caja {

	
	@Id
	private String numreferencia ;
	
	@Column(name = "contenido")
	private String contenido;
	
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne()
    @JoinColumn(name = "almacen")
    Almacen almacen;
	
	public Caja() {
		
	}
	
	
	
	public Caja(String numreferencia, String contenido, int valor,Almacen almacen) {
		//super();
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}



	public String getNumreferencia() {
		return this.numreferencia;
	}

	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacenes() {
		return this.almacen;
	}

	public void setAlmacenes(Almacen almacen) {
		this.almacen = almacen;
	}



	@Override
	public String toString() {
		return "Empleado [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacenes="
				+ almacen + "]";
	}

	
	
}
