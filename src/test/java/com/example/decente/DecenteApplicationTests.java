package com.example.decente;

import com.example.decente.model.Autor;
import com.example.decente.repositories.AutorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class DecenteApplicationTests {

    AutorRepository autorRepository;

    @Test
    @Sql("classpath:dataset.sql")
    public void encontrarPorNombre (String nombre){
        Autor autor= autorRepository.findByNombre(nombre);
    }

}
