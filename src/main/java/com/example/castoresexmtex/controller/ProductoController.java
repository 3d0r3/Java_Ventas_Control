package com.example.castoresexmtex.controller;

import com.example.castoresexmtex.model.Producto;
import com.example.castoresexmtex.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }
}
