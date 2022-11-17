package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Almacen;

public interface IAlmacenesDAO extends JpaRepository<Almacen, Integer> {
	
	//Listar fabricantes por campo nombre
		public List<Almacen> findByLugar(String lugar);
}
