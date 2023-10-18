package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoCatTipoParametroDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatTipoParametro.TblProsaDemoCatTipoParametroDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoCatTipoParametro;
import com.example.DemoPosaBackend.service.TblProsaDemoCatParametrosService;
import com.example.DemoPosaBackend.service.TblProsaDemoCatTipoParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoCatTipoParametroServiceImpl implements TblProsaDemoCatTipoParametroService {

    TblProsaDemoCatTipoParametroDao tipoParametroDao;

    public TblProsaDemoCatTipoParametroServiceImpl(TblProsaDemoCatTipoParametroDao tipoParametroDao) {
        this.tipoParametroDao = tipoParametroDao;
    }

    @Override
    public List<TblProsaDemoCatTipoParametroDto> getAll(){
        List <TblProsaDemoCatTipoParametro> listTipoParametro =  tipoParametroDao.getAllTiposParametro();
        List <TblProsaDemoCatTipoParametroDto> dtoResponse = new ArrayList<>();

        listTipoParametro.forEach(tipoParametro ->{
            TblProsaDemoCatTipoParametroDto dto = new TblProsaDemoCatTipoParametroDto(tipoParametro);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }
}
