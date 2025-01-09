package com.example.RIS.repository;

import com.example.RIS.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio para Turnos
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}