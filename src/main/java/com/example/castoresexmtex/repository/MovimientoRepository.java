package com.example.castoresexmtex.repository;


import com.example.castoresexmtex.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByTipoMovimiento(String tipoMovimiento);
}