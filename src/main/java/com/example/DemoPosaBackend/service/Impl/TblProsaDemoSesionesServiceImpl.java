package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoSesionesDao;
import com.example.DemoPosaBackend.dao.TblProsaDemoVersionesDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoSesiones.TblProsaDemoSesionesDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoSesiones;
import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;
import com.example.DemoPosaBackend.service.TblProsaDemoSesionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoSesionesServiceImpl implements TblProsaDemoSesionesService {
    @Autowired
    private TblProsaDemoSesionesDao daoSesiones;

    public TblProsaDemoSesionesServiceImpl(TblProsaDemoSesionesDao daoSesiones){
        this.daoSesiones = daoSesiones;
    }

    @Override
    public List<TblProsaDemoSesionesDto> getAll(){
        List<TblProsaDemoSesiones> sesionesList = daoSesiones.getAllSesiones();
        List<TblProsaDemoSesionesDto> dtoResponse = new ArrayList<>();

        sesionesList.forEach(sesion ->{
            TblProsaDemoSesionesDto dto = new TblProsaDemoSesionesDto(sesion);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }
}
