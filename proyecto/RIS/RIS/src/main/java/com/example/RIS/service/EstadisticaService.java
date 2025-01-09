package com.example.RIS.service;

import com.example.RIS.model.Estadistica;
import com.example.RIS.repository.EstadisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticaService {
    @Autowired
    private EstadisticaRepository estadisticaRepository;

    public List<Estadistica> listarEstadisticas() {
        return estadisticaRepository.findAll();
    }

    public Estadistica guardarEstadistica(Estadistica estadistica) {
        return estadisticaRepository.save(estadistica);
    }
}
