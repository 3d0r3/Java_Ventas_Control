package com.example.castoresexmtex.controller;

import com.example.castoresexmtex.model.Rol;
import com.example.castoresexmtex.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> findAll() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public Rol findById(@PathVariable Long id) {
        return rolService.findById(id);
    }

    @PostMapping
    public Rol save(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        rolService.deleteById(id);
    }
}