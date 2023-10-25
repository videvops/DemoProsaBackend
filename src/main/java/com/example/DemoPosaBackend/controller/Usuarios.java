package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.RequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.TblProsaDemoUsuariosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoUsuariosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    // Crear un usuario
    @PostMapping
    public ResponseEntity <?> createUsuario(@RequestBody RequestDto request){
        return new ResponseEntity<>(usuariosService.createUsuario(request), HttpStatus.OK);
    }
}
