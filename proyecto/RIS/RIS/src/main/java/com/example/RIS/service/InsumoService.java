package com.example.RIS.service;

import com.example.RIS.model.Insumo;
import com.example.RIS.repository.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsumoService {
    @Autowired
    private InsumoRepository insumoRepository;

    public List<Insumo> listarInsumos() {
        return insumoRepository.findAll();
    }

    public Insumo guardarInsumo(Insumo insumo) {
        return insumoRepository.save(insumo);
    }
}
