package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoParametrosService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    @PostMapping ResponseEntity <TblProsaDemoParametrosDto> createParametro(){
        return new ResponseEntity<>(parametrosService.createParametro(), HttpStatus.OK);
    }

}
