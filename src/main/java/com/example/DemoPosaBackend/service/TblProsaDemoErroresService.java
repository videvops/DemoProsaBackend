package com.example.DemoPosaBackend.service;

import com.example.DemoPosaBackend.dto.TblProsaDemoErrores.TblProsaDemoErroresDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoErrores;

import java.util.List;

public interface TblProsaDemoErroresService {
    public List <TblProsaDemoErroresDto> getAll();
    public TblProsaDemoErrores getByID(Integer id);
}
