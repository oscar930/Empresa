package com.prueba.Empresa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.Empresa.model.Franquicia;
import com.prueba.Empresa.service.FranquiciaService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/franquicias")
public class FranquiciaController {
	
	@Autowired
	private FranquiciaService franquiciaService;
	
	@PostMapping
	public Franquicia agregarFranquicia(@RequestBody Franquicia franquicia) {
		return franquiciaService.saveFranquicia(franquicia);
	}
	
	@PutMapping("/{id}")
	public Franquicia updateNombre(@PathVariable Long id, @RequestParam String nuevoNombre) {
		return franquiciaService.updateNombre(id, nuevoNombre);
	}
	

}
