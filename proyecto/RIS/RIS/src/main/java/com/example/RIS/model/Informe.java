package com.example.RIS.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "informes")
public class Informe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInforme;

    private String paciente;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    // Getters y Setters
    public Long getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(Long idInforme) {
        this.idInforme = idInforme;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
