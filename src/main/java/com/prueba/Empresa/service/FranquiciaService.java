package com.prueba.Empresa.service;

import org.springframework.stereotype.Service;

import com.prueba.Empresa.model.Franquicia;
import com.prueba.Empresa.repository.FranquiciaRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FranquiciaService {
	
	@Autowired
	private FranquiciaRepository franquiciaRepository;
	
	public Franquicia saveFranquicia(Franquicia franquicia) {
		return franquiciaRepository.save(franquicia);
	}
	
	public Franquicia updateNombre(Long id, String nuevoNombre) {
		Franquicia franquicia = franquiciaRepository.findById(id).orElseThrow();
		franquicia.setNombre(nuevoNombre);
		return franquiciaRepository.save(franquicia);
	}

}
