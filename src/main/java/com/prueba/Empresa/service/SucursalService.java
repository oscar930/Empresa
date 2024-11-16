package com.prueba.Empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.Empresa.model.Franquicia;
import com.prueba.Empresa.model.Sucursal;
import com.prueba.Empresa.repository.SucursalRepository;

@Service
public class SucursalService {
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	public Sucursal save(Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}
	
	public Sucursal updateNombre(Long id, String nuevoNombre) {
		Sucursal sucursal = sucursalRepository.findById(id).orElseThrow();
		sucursal.setNombre(nuevoNombre);
		return sucursalRepository.save(sucursal);
	}

}
