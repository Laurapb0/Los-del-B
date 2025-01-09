package com.example.RIS.repository;

import com.example.RIS.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


// Repositorio para Facturas
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
