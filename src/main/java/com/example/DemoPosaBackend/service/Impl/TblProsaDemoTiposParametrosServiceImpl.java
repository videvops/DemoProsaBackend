package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoTiposParametrosDao;
import com.example.DemoPosaBackend.dao.TblProsaDemoVersionesDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoTiposParametros.TblProsaDemoTiposParametrosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoTiposParametros;
import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;
import com.example.DemoPosaBackend.service.TblProsaDemoTiposParametrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoTiposParametrosServiceImpl implements TblProsaDemoTiposParametrosService {
    @Autowired
    private TblProsaDemoTiposParametrosDao daoTipos;

    public TblProsaDemoTiposParametrosServiceImpl(TblProsaDemoTiposParametrosDao daoTipos){
        this.daoTipos = daoTipos;
    }

    @Override
    public List<TblProsaDemoTiposParametrosDto> getAll(){
        List<TblProsaDemoTiposParametros> tiposList = daoTipos.getAllTipos();
        List<TblProsaDemoTiposParametrosDto> dtoResponse = new ArrayList<>();

        tiposList.forEach(tipo ->{
            TblProsaDemoTiposParametrosDto dto = new TblProsaDemoTiposParametrosDto(tipo);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }
}
