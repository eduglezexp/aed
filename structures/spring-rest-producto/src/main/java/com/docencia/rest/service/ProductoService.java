package com.docencia.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docencia.rest.model.ProductoEntity;
import com.docencia.rest.repository.ProductoRepository;
import com.docencia.rest.repository.interfaces.DetalleProductoRepository;
import com.docencia.rest.service.interfaces.IProductoService;

@Service
public class ProductoService implements IProductoService {

    private ProductoRepository productoRepository;
    private DetalleProductoRepository detalleProductoRepository;

    @Autowired
    public void setProductoRepository(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Autowired
    public void setDetalleProductoDocument(DetalleProductoRepository detalleProductoRepository) {
        this.detalleProductoRepository = detalleProductoRepository;
    }

    @Override
    public Optional<ProductoEntity> findById(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public Optional<ProductoEntity> find(ProductoEntity producto) {
        return findById(producto.getId());
    }

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    @Override
    public boolean deleteById(int id) {
        Optional<ProductoEntity> producto = findById(id);
        if (producto.isEmpty()) {
            return false;
        }
        productoRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean delete(ProductoEntity producto) {
        if (producto == null) {
            return false;
        }
        productoRepository.delete(producto);
        return true;
    }
}
