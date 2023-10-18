package com.example.DemoPosaBackend.controller;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatTipoParametro.TblProsaDemoCatTipoParametroDto;
import com.example.DemoPosaBackend.service.TblProsaDemoCatTipoParametroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catTipoParametro")
public class CatTipoParametro {


    TblProsaDemoCatTipoParametroService catTipoParametroService;

    public CatTipoParametro(TblProsaDemoCatTipoParametroService catTipoParametroService) {
        this.catTipoParametroService = catTipoParametroService;
    }

    @GetMapping
    public ResponseEntity<List<TblProsaDemoCatTipoParametroDto>> getCatTiposParametros() {
        return new ResponseEntity<List<TblProsaDemoCatTipoParametroDto>>(catTipoParametroService.getAll(), HttpStatus.OK);
    }

}
