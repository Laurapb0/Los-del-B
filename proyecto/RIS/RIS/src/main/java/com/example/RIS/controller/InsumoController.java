package com.example.RIS.controller;

import com.example.RIS.model.Insumo;
import com.example.RIS.service.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insumos")
public class InsumoController {
    @Autowired
    private InsumoService insumoService;

    @GetMapping
    public List<Insumo> listarInsumos() {
        return insumoService.listarInsumos();
    }

    @PostMapping
    public Insumo guardarInsumo(@RequestBody Insumo insumo) {
        return insumoService.guardarInsumo(insumo);
    }
}
