package com.prueba.Empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.Empresa.model.Franquicia;
import com.prueba.Empresa.model.Sucursal;
import com.prueba.Empresa.service.FranquiciaService;
import com.prueba.Empresa.service.SucursalService;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {
	
	@Autowired
	private SucursalService sucursalService;
	
	@PostMapping
	public Sucursal agregarSucursal(@RequestBody Sucursal sucursal) {
		return sucursalService.save(sucursal);
	}
	
	@PutMapping("/{id}")
	public Sucursal updateNombre(@PathVariable Long id, @RequestParam String nuevoNombre) {
		return sucursalService.updateNombre(id, nuevoNombre);
	}

}
