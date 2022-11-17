package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="almacenes")//en caso que la tabala sea diferente
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;

	@OneToMany
    @JoinColumn(name="almacen")
    private List<Caja> cajas;
	
	public Almacen() {
		
	}
	
	public Almacen(int codigo, String lugar, int capacidad) {
		//super();
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad=capacidad;
	}

	/**
	 * @return codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return nombre
	 */

	public String getLugar() {
		return lugar;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * 
	 * @return empleados
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacenes")
	public List<Caja> getEmpleados() {
		return cajas;
	}
	
	/**
	 * 
	 * @param cajas
	 */
	
	public void setEmpleados(List<Caja> cajas) {
		this.cajas = cajas;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad +"]";
	}
	
	
	
}
