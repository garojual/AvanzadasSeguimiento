package com.example.decente.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CodigoPrestamo", length = 5)
    private int codigoPrestamo;
    @Column(name = "CedulaPersona", length = 10, unique = true, updatable = false)
    private String cedulaPersona;
    @Column(name = "FechaPrestamo")
    private SimpleDateFormat fechaPrestamo;
    @Column(name = "FechaDevolucion")
    private SimpleDateFormat fechaDevolucion;

}
