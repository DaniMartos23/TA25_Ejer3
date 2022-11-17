package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Almacen;
import com.crud.h2.service.AlmacenesServiceImpl;


@RestController
@RequestMapping("/api")

public class AlmacenesController {
	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	//listar almaceness por campo nombre
	@GetMapping("/almacenes/lugar/{lugar}")
	public List<Almacen> listarAlmacenesNombre(@PathVariable(name="lugar") String lugar) {
	    return almacenesServiceImpl.listarAlmacenesNombre(lugar);
	}
	
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacenes(@RequestBody Almacen almacen) {
		return almacenesServiceImpl.guardarAlmacenes(almacen);
	}
	
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen AlmacenesXID(@PathVariable(name="codigo") int id) {
		
		Almacen almacenes_xid= new Almacen();
		
		almacenes_xid= almacenesServiceImpl.almacenesXID(id);
		
		System.out.println("Almacenes XID: "+almacenes_xid);
		
		return almacenes_xid;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacenes(@PathVariable(name="codigo")int id, @RequestBody Almacen almacen) {
		
		Almacen almacenes_seleccionado= new Almacen();
		Almacen almacenes_actualizado= new Almacen();
		
		almacenes_seleccionado= almacenesServiceImpl.almacenesXID(id);
		
		almacenes_seleccionado.setLugar(almacen.getLugar());
		almacenes_seleccionado.setCapacidad(almacen.getCapacidad());
		almacenes_actualizado = almacenesServiceImpl.actualizarAlmacenes(almacenes_seleccionado);
		
		System.out.println("El Almacenes actualizado es: "+ almacenes_actualizado);
		
		return almacenes_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacenes(@PathVariable(name="codigo")int id) {
		almacenesServiceImpl.eliminarAlmacenes(id);
	}
}
