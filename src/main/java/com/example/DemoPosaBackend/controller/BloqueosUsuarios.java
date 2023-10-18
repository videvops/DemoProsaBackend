package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoBloqueosUsuarios.TblProsaDemoBloqueosUsuariosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.service.TblProsaDemoBloqueosUsuariosService;
import com.example.DemoPosaBackend.service.TblProsaDemoVersionesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/bloqueosUsuarios")
public class BloqueosUsuarios {
    private TblProsaDemoBloqueosUsuariosService bloqueosService;

    public BloqueosUsuarios(TblProsaDemoBloqueosUsuariosService bloqueosService) {
        this.bloqueosService = bloqueosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoBloqueosUsuariosDto>> getVersiones(){
        return new ResponseEntity<List <TblProsaDemoBloqueosUsuariosDto>>(bloqueosService.getAll(), HttpStatus.OK);
    }
}
