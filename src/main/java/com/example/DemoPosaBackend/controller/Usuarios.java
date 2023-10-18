package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.TblProsaDemoUsuariosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoUsuariosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Usuarios {
    private TblProsaDemoUsuariosService usuariosService;

    public Usuarios(TblProsaDemoUsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoUsuariosDto>> getUsuarios(){
        return new ResponseEntity<List <TblProsaDemoUsuariosDto>>(usuariosService.getAll(), HttpStatus.OK);
    }
}
