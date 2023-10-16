package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoErrores.TblProsaDemoErroresDto;
import com.example.DemoPosaBackend.service.TblProsaDemoErroresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/errores")

public class Errores {

    private TblProsaDemoErroresService erroresService;

    public Errores(TblProsaDemoErroresService erroresService){
        this.erroresService = erroresService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoErroresDto>> getErrores(){
        return new ResponseEntity<List <TblProsaDemoErroresDto>>(erroresService.getAll(), HttpStatus.OK);
    }


}
