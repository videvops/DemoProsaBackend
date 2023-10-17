package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoSesiones.TblProsaDemoSesionesDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.service.TblProsaDemoSesionesService;
import com.example.DemoPosaBackend.service.TblProsaDemoVersionesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sesiones")
public class Sesiones {
    private TblProsaDemoSesionesService sesionesService;

    public Sesiones(TblProsaDemoSesionesService sesionesService) {
        this.sesionesService = sesionesService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoSesionesDto>> getSesiones(){
        return new ResponseEntity<List <TblProsaDemoSesionesDto>>(sesionesService.getAll(), HttpStatus.OK);
    }
}
