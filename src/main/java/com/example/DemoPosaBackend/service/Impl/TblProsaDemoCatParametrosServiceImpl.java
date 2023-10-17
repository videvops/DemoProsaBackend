package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoCatParametrosDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatParametros.TblProsaDemoCatParametrosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoParametros.TblProsaDemoParametrosDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoCatParametros;
import com.example.DemoPosaBackend.entities.TblProsaDemoParametros;
import com.example.DemoPosaBackend.service.TblProsaDemoCatParametrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoCatParametrosServiceImpl implements TblProsaDemoCatParametrosService {

    @Autowired
    TblProsaDemoCatParametrosDao catParametrosDao;

    public TblProsaDemoCatParametrosServiceImpl(TblProsaDemoCatParametrosDao catParametrosDao) {
        this.catParametrosDao = catParametrosDao;
    }

    @Override
    public List<TblProsaDemoCatParametrosDto> getAll(){
        List<TblProsaDemoCatParametros> catParametrosList = catParametrosDao.getAllCatParametros();
        List<TblProsaDemoCatParametrosDto> dtoResponse = new ArrayList<>();

        catParametrosList.forEach(parametro ->{
            TblProsaDemoCatParametrosDto dto = new TblProsaDemoCatParametrosDto(parametro);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }

}
