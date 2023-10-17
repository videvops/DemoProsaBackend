package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoVersionesDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;
import com.example.DemoPosaBackend.service.TblProsaDemoVersionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoVersionesServiceImpl implements TblProsaDemoVersionesService {

    @Autowired
    private TblProsaDemoVersionesDao daoVersiones;

    public TblProsaDemoVersionesServiceImpl(TblProsaDemoVersionesDao daoVersiones){
        this.daoVersiones = daoVersiones;
    }

    @Override
    public List<TblProsaDemoVersionesDto> getAll(){
        List<TblProsaDemoVersiones> versionesList = daoVersiones.getAllVersiones();
        List<TblProsaDemoVersionesDto> dtoResponse = new ArrayList<>();

        versionesList.forEach(version ->{
            TblProsaDemoVersionesDto dto = new TblProsaDemoVersionesDto(version);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }
}
