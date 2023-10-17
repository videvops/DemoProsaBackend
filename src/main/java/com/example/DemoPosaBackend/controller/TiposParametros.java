package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoTiposParametros.TblProsaDemoTiposParametrosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoParametrosService;
import com.example.DemoPosaBackend.service.TblProsaDemoTiposParametrosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposParametros")
public class TiposParametros {
    private TblProsaDemoTiposParametrosService tiposParametrosService;

    public TiposParametros(TblProsaDemoTiposParametrosService tiposParametrosService) {
        this.tiposParametrosService = tiposParametrosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoTiposParametrosDto>> getTiposParametros() {
        return new ResponseEntity<List<TblProsaDemoTiposParametrosDto>>(tiposParametrosService.getAll(), HttpStatus.OK);
    }
}
