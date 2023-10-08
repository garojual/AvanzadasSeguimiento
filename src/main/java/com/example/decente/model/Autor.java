package com.example.decente.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor implements Serializable {
    @Id
    @Column(name = "CodigoAutor", length = 5, nullable = false)
    private String codigoAutor;
    @Column(name = "Nombre", length = 60)
    private String nombre;
}
