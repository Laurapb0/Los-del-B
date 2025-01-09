package com.example.RIS.service;

import com.example.RIS.model.Factura;
import com.example.RIS.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
}
