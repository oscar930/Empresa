package com.prueba.Empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.Empresa.model.Producto;
import com.prueba.Empresa.model.Sucursal;
import com.prueba.Empresa.repository.ProductoRepository;
import com.prueba.Empresa.repository.SucursalRepository;


@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public void delete(Long id) {
		productoRepository.deleteById(id);
	}
	
	
	public Producto updateStock(Long id, int nuevoStock) {
		Producto producto = productoRepository.findById(id).orElseThrow();
		producto.setStock(nuevoStock);
		return productoRepository.save(producto);
	}
	
	public Producto findProductoConMasStock(Long sucursalId) {
		return productoRepository.findTopBySucursalIdOrderByStockDesc(sucursalId);
	}

}
