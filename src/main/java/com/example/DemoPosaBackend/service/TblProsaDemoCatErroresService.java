package com.example.DemoPosaBackend.service;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.CatErroresRequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;

import java.text.ParseException;
import java.util.List;

public interface TblProsaDemoCatErroresService {
    public List <TblProsaDemoCatErroresDto> getAll();
    public TblProsaDemoCatErroresDto save(CatErroresRequestDto RequestDto) throws ParseException;
}
