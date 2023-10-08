package com.example.decente.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
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
public class Persona implements Serializable {
    @Id
    @Column(name = "Cedula", length = 10)
    private String cedula;
    @Column(name = "Nombre", length = 60)
    private String nombre;
    @Column(name = "Email", length = 80)
    @Email
    private String email;
    @Column(name = "Telefono", length = 10)
    private String telefono;
    @Column(name = "CodigoCiudad", length = 5)
    private int codigoCiudad;
}
