package com.example.RIS.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "estadisticas")
public class Estadistica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadistica;

    private String descripcion;
    private String valor;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    // Getters y Setters
    public Long getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(Long idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
