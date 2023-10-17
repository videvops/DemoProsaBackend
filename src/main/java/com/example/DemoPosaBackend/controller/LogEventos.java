package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoLogEventos.TblProsaDemoLogEventosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.service.TblProsaDemoLogEventosService;
import com.example.DemoPosaBackend.service.TblProsaDemoVersionesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
