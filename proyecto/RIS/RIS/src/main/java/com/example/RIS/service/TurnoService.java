package com.example.RIS.service;

import com.example.RIS.model.Turno;
import com.example.RIS.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;

    public List<Turno> listarTurnos() {
        return turnoRepository.findAll();
    }

    public Turno guardarTurno(Turno turno) {
        return turnoRepository.save(turno);
    }
}
