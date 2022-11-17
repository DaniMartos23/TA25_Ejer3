package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Caja;

public interface ICajasService {
	//Metodos del CRUD
	public List<Caja> listarCajas(); //Listar All 
	
	public Caja guardarCaja(Caja caja);	//Guarda un caja CREATE
	
	public Caja cajaXID(String dni); //Leer datos de un caja READ
			
	public List<Caja> listarCajaNombre(String nombre);//Listar Cajas por campo nombre
			
	public Caja actualizarCaja(Caja caja); //Actualiza datos del caja UPDATE
			
	public void eliminarCaja(String dni);// Elimina el caja DELETE
}
