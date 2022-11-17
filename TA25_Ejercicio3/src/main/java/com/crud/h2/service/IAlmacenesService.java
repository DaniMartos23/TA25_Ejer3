package com.crud.h2.service;

import java.util.List;
import com.crud.h2.dto.Almacen;

public interface IAlmacenesService {
	//Metodos del CRUD
		public List<Almacen> listarAlmacenes(); //Listar All 
		
		public Almacen guardarAlmacenes(Almacen almacen);	//Guarda un almacenes CREATE
		
		public Almacen almacenesXID(int id); //Leer datos de un almacenes READ
		
		public List<Almacen> listarAlmacenesNombre(String nombre);//Listar Almacenes por campo nombre
		
		public Almacen actualizarAlmacenes(Almacen almacen); //Actualiza datos del almacenes UPDATE
		
		public void eliminarAlmacenes(int id);// Elimina el almacenes DELETE
}
