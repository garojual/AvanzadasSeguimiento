package com.example.decente.repositories;

import com.example.decente.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AutorRepository extends JpaRepository<Autor,String> {

    @Query
    public Autor findByNombre(String nombre);
}
