package com.example.decente.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genero implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CodigoGenero", length = 3)
    private int codigoGenero;
    @Column(name = "Nombre", length = 60, nullable = false, unique = true)
    private String nombre;
//    @OneToMany
//    private List<Libro> Libros;
}
