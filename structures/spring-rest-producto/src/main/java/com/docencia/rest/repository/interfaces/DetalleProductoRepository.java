package com.docencia.rest.repository.interfaces;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.docencia.rest.model.DetalleProductoDocument;

public interface DetalleProductoRepository extends MongoRepository<DetalleProductoDocument, Integer>{
    //Optional<DetalleProductoDocument> findByProductoId(int productoId);
    //DetalleProductoDocument save(int productoId, DetalleProductoDocument detalle);
    //boolean deleteByProductoId(int productoId);
}
