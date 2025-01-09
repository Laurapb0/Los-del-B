package com.example.RIS.controller;

import com.example.RIS.model.Factura;
import com.example.RIS.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> listarFacturas() {
        return facturaService.listarFacturas();
    }

    @PostMapping
    public Factura guardarFactura(@RequestBody Factura factura) {
        return facturaService.guardarFactura(factura);
    }
}
