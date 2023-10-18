package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoErroresDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoErrores.TblProsaDemoErroresDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoErrores;
import com.example.DemoPosaBackend.service.TblProsaDemoErroresService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoErroresServiceImpl implements TblProsaDemoErroresService {

    private TblProsaDemoErroresDao erroresDao ;

    public TblProsaDemoErroresServiceImpl(TblProsaDemoErroresDao erroresDao) {
        this.erroresDao = erroresDao;
    }

    @Override
    public List<TblProsaDemoErroresDto> getAll(){
        List<TblProsaDemoErrores> listErrores= erroresDao.getAllErrores();
        List<TblProsaDemoErroresDto> listErroresDto= new ArrayList<>();
        listErrores.forEach(error -> {
            TblProsaDemoErroresDto dto = new TblProsaDemoErroresDto(error);
            listErroresDto.add(dto);
        });
        return listErroresDto;
    }
}
