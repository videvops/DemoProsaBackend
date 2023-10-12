package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoParametrosDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoParametros;
import com.example.DemoPosaBackend.service.TblProsaDemoParametrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TblProsaDemoParametrosServiceImpl implements TblProsaDemoParametrosService {

    @Autowired
    private TblProsaDemoParametrosDao daoParametros;

    public TblProsaDemoParametrosServiceImpl(TblProsaDemoParametrosDao daoParametros) {
        this.daoParametros = daoParametros;
    }

    @Override
    public List<TblProsaDemoParametrosDto> getAll(){
        List<TblProsaDemoParametros> parametrosList = daoParametros.getAllParametros();
        List<TblProsaDemoParametrosDto> dtoResponse = new ArrayList<>();

        parametrosList.forEach(parametro ->{
            TblProsaDemoParametrosDto dto = new TblProsaDemoParametrosDto(parametro);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }
}
