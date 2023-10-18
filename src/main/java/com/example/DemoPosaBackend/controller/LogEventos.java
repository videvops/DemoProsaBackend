package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoLogEventos.TblProsaDemoLogEventosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoLogEventosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/logEventos")
public class LogEventos {
    private TblProsaDemoLogEventosService logEventosService;

    public LogEventos(TblProsaDemoLogEventosService logEventosService) {
        this.logEventosService = logEventosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoLogEventosDto>> getLogEventos(){
        return new ResponseEntity<List <TblProsaDemoLogEventosDto>>(logEventosService.getAll(), HttpStatus.OK);
    }
}
