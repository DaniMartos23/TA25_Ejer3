package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Caja;

public interface ICajasDAO extends JpaRepository<Caja, String> {
	//Listar articulos por campo nombre
			public List<Caja> findByContenido(String contenido);
}
