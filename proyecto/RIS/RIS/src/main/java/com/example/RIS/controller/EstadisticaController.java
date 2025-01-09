package com.example.RIS.controller;

import com.example.RIS.model.Estadistica;
import com.example.RIS.service.EstadisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticaController {
    @Autowired
    private EstadisticaService estadisticaService;

    @GetMapping
    public List<Estadistica> listarEstadisticas() {
        return estadisticaService.listarEstadisticas();
    }

    @PostMapping
    public Estadistica guardarEstadistica(@RequestBody Estadistica estadistica) {
        return estadisticaService.guardarEstadistica(estadistica);
    }
}
