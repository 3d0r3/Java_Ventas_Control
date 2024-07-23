package com.example.castoresexmtex.controller;

import com.example.castoresexmtex.model.Movimiento;
import com.example.castoresexmtex.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping
    public List<Movimiento> findAll() {
        return movimientoService.findAll();
    }

    @GetMapping("/{id}")
    public Movimiento findById(@PathVariable Long id) {
        return movimientoService.findById(id);
    }

    @GetMapping("/tipo/{tipoMovimiento}")
    public List<Movimiento> findByTipoMovimiento(@PathVariable String tipoMovimiento) {
        return movimientoService.findByTipoMovimiento(tipoMovimiento);
    }

    @PostMapping
    public Movimiento save(@RequestBody Movimiento movimiento) {
        return movimientoService.save(movimiento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        movimientoService.deleteById(id);
    }
}