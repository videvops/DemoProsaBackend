package com.example.DemoPosaBackend.service;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;

import java.util.List;

public interface TblProsaDemoCatErroresService {
    public List <TblProsaDemoCatErroresDto> getAll();

    public TblProsaDemoCatErroresDto save(TblProsaDemoCatErroresDto dto);
}
