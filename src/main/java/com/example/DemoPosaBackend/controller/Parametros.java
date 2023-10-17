package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoParametrosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parametros")
public class Parametros {

    private TblProsaDemoParametrosService parametrosService;

    public Parametros(TblProsaDemoParametrosService parametrosService) {
        this.parametrosService = parametrosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoParametrosDto>> getParametros() {
        return new ResponseEntity<List<TblProsaDemoParametrosDto>>(parametrosService.getAll(), HttpStatus.OK);
    }
}
