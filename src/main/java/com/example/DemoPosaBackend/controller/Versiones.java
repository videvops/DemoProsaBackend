package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.service.TblProsaDemoVersionesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/versiones")
public class Versiones {
    private TblProsaDemoVersionesService versionesService;

    public Versiones(TblProsaDemoVersionesService versionesService) {
        this.versionesService = versionesService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoVersionesDto>> getVersiones(){
        return new ResponseEntity<List <TblProsaDemoVersionesDto>>(versionesService.getAll(), HttpStatus.OK);
    }
}
