package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajasDAO;
import com.crud.h2.dto.Caja;


@Service
public class CajasServiceImpl implements ICajasService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ICajasDAO iCajasDAO;
	
	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String dni) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(dni).get();
	}

	@Override
	public List<Caja> listarCajaNombre(String contenido) {
		// TODO Auto-generated method stub
		return iCajasDAO.findByContenido(contenido);
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String dni) {
		
		iCajasDAO.deleteById(dni);
		
	}
	
	

}
