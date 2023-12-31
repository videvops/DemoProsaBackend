package com.example.DemoPosaBackend.service;

import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.RequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.TblProsaDemoUsuariosDto;

import java.util.List;

public interface TblProsaDemoUsuariosService {
    public List<TblProsaDemoUsuariosDto> getAll();

    public TblProsaDemoUsuariosDto createUsuario(RequestDto request);
}
