package com.example.DemoPosaBackend.UsuarioTests;

import com.example.DemoPosaBackend.service.TblProsaDemoUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UsuarioTests {

    @Autowired
    private TblProsaDemoUsuariosService usuariosService;

}
