package com.example.decente;

import com.example.decente.model.Autor;
import com.example.decente.repositories.AutorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class DecenteApplicationTests {

    @Autowired
    AutorRepository autorRepository;

    @Test
    @Sql("classpath:dataset.sql")
    public void encontrarPorNombre (){
        Autor autor= autorRepository.findByNombre("David");
        System.out.println(autor.getCodigoAutor());
    }

}
