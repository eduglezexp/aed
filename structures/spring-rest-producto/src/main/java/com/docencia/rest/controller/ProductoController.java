package com.docencia.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docencia.rest.model.Producto;
import com.docencia.rest.service.interfaces.IProductoService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private IProductoService productoService;

    @Autowired
    public void setProductoService(IProductoService productoService) {
        this.productoService = productoService;
    }

    @Operation(summary = "Get all productos")
    @GetMapping("/")
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }
}
