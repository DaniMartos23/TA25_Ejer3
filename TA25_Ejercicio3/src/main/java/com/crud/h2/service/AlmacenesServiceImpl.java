package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenesDAO;
import com.crud.h2.dto.Almacen;



@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	
	
		@Autowired
		IAlmacenesDAO iAlmacenessDAO;
		
	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenessDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacenes(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenessDAO.save(almacen);
	}

	@Override
	public Almacen almacenesXID(int id) {
		// TODO Auto-generated method stub
		return iAlmacenessDAO.findById(id).get();
	}

	@Override
	public List<Almacen> listarAlmacenesNombre(String lugar) {
		// TODO Auto-generated method stub
		return iAlmacenessDAO.findByLugar(lugar);
	}

	@Override
	public Almacen actualizarAlmacenes(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenessDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacenes(int id) {
		// TODO Auto-generated method stub
		iAlmacenessDAO.deleteById(id);
	}

}
