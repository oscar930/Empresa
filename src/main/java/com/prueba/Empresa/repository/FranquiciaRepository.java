package com.prueba.Empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.Empresa.model.Franquicia;

@Repository
public interface FranquiciaRepository extends JpaRepository<Franquicia, Long>{

}
