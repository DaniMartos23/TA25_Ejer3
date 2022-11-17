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

import com.crud.h2.dto.Caja;
import com.crud.h2.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")

public class CajasController {

	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajasServiceImpl.listarCajas();
	}
	
	//listar cajas por campo nombre
	@GetMapping("/cajas/nombre/{nombre}")
	public List<Caja> listarCajaNombre(@PathVariable(name="nombre") String nombre) {
	    return cajasServiceImpl.listarCajaNombre(nombre);
	}
	
	
	@PostMapping("/cajas")
	public Caja salvarCaja( @RequestBody Caja caja) {
		return cajasServiceImpl.guardarCaja(caja);
	}
	
	
	@GetMapping("/cajas/{numreferencia}")
	public Caja CajaXID(@PathVariable(name="numreferencia") String numreferencia) {
		
		Caja caja_xid= new Caja();
		
		caja_xid= cajasServiceImpl.cajaXID(numreferencia);
		
		System.out.println("Caja XID: "+caja_xid);
		
		return caja_xid;
	}
	
	@PutMapping("/cajas/{numreferencia}")
	public Caja actualizarCaja(@PathVariable(name="numreferencia")String numreferencia, @RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajasServiceImpl.cajaXID(numreferencia);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacenes(caja.getAlmacenes());
		caja_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El Caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{numreferencia}")
	public void eleiminarCaja(@PathVariable(name="numreferencia")String numreferencia) {
		cajasServiceImpl.eliminarCaja(numreferencia);
	}
}
