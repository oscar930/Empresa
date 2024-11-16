package com.prueba.Empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.Empresa.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	List<Producto> findBySucursalId(Long sucursalId);
	Producto findTopBySucursalIdOrderByStockDesc(Long sucursalId);
}
