package com.prueba.Empresa.repository;

import org.springframework.stereotype.Repository;
import com.prueba.Empresa.model.Franquicia;
import com.prueba.Empresa.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long>{

}
