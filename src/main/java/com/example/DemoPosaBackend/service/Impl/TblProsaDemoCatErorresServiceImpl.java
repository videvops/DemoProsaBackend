package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoCatErroresDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;
import com.example.DemoPosaBackend.service.TblProsaDemoCatErroresService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoCatErorresServiceImpl implements TblProsaDemoCatErroresService {


    private TblProsaDemoCatErroresDao catErroresDao;


    public TblProsaDemoCatErorresServiceImpl(TblProsaDemoCatErroresDao catErroresDao) {
        this.catErroresDao = catErroresDao;
    }

    @Override
    public List<TblProsaDemoCatErroresDto> getAll() {

        List<TblProsaDemoCatErrores> listCatErrores= catErroresDao.getAllCatErrores();
        List<TblProsaDemoCatErroresDto> listCatErroresDto= new ArrayList<>();
        listCatErrores.forEach(error -> {
            TblProsaDemoCatErroresDto dto = new TblProsaDemoCatErroresDto(error);
            listCatErroresDto.add(dto);
        });
        return listCatErroresDto;
    }

    // Crear un nuevo error
    @Override
    public TblProsaDemoCatErroresDto save(TblProsaDemoCatErroresDto dto) {
        TblProsaDemoCatErrores catErrores = new TblProsaDemoCatErrores(dto);
        catErroresDao.save(catErrores);
        return new TblProsaDemoCatErroresDto(catErrores);
    }
}
