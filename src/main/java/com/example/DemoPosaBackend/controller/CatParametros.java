package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatParametros.TblProsaDemoCatParametrosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoTiposParametros.TblProsaDemoTiposParametrosDto;
import com.example.DemoPosaBackend.service.TblProsaDemoCatParametrosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("catParametros")
public class CatParametros {

    private TblProsaDemoCatParametrosService catParametrosService;

    public CatParametros(TblProsaDemoCatParametrosService catParametrosService) {
        this.catParametrosService = catParametrosService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoCatParametrosDto>> getTiposParametros() {
        return new ResponseEntity<List<TblProsaDemoCatParametrosDto>>(catParametrosService.getAll(), HttpStatus.OK);
    }
}
