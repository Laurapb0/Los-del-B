package com.example.RIS.controller;

import com.example.RIS.model.Turno;
import com.example.RIS.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    @GetMapping
    public List<Turno> listarTurnos() {
        return turnoService.listarTurnos();
    }

    @PostMapping
    public Turno guardarTurno(@RequestBody Turno turno) {
        return turnoService.guardarTurno(turno);
    }
}
