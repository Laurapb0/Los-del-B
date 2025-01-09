package com.example.RIS.service;

import com.example.RIS.model.Informe;
import com.example.RIS.repository.InformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformeService {

    @Autowired
    private InformeRepository informeRepository;

    public List<Informe> listarInformes() {
        return informeRepository.findAll();
    }

    public Informe guardarInforme(Informe informe) {
        return informeRepository.save(informe);
    }
}
