package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoErrores.TblProsaDemoErroresDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;
import com.example.DemoPosaBackend.service.TblProsaDemoCatErroresService;
import com.example.DemoPosaBackend.service.TblProsaDemoErroresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catErrores")
public class CatErrores {

    private TblProsaDemoCatErroresService erroresCatService ;


    public CatErrores(TblProsaDemoCatErroresService erroresCatService) {
        this.erroresCatService = erroresCatService;
    }


    @GetMapping
    public ResponseEntity<List<TblProsaDemoCatErroresDto>> getErrores(){
        return new ResponseEntity<List <TblProsaDemoCatErroresDto>>(erroresCatService.getAll(), HttpStatus.OK);
    }
}
