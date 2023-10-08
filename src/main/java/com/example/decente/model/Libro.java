package com.example.decente.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro implements Serializable {
    @Id
    @Column(name = "ISBN",length = 13)
    private String isbn;
    @Column(name = "Nombre", unique = true, nullable = false, length = 60)
    private String nombre;
    @Column(name = "CodigoGenero", length = 5, nullable = false)
    private int codigoGenero;
    @Column(name = "Unidades", length = 10, updatable = true)
    private int unidades;
    @Column(name = "Anio", length = 4)
    private String anio;
}
