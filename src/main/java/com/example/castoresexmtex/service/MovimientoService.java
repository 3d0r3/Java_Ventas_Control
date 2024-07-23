package com.example.castoresexmtex.service;

import com.example.castoresexmtex.model.Movimiento;
import com.example.castoresexmtex.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    public List<Movimiento> findByTipoMovimiento(String tipoMovimiento) {
        return movimientoRepository.findByTipoMovimiento(tipoMovimiento);
    }

    public Movimiento findById(Long id) {
        return movimientoRepository.findById(id).orElse(null);
    }

    public Movimiento save(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public void deleteById(Long id) {
        movimientoRepository.deleteById(id);
    }
}
