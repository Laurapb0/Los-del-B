package com.example.RIS.repository;

import com.example.RIS.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio para Estadisticas
public interface EstadisticaRepository extends JpaRepository<Estadistica, Long> {
}