package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.Utilities.FormatDate;
import com.example.DemoPosaBackend.dao.TblProsaDemoCatErroresDao;
import com.example.DemoPosaBackend.dao.TblProsaDemoErroresDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.CatErroresRequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;
import com.example.DemoPosaBackend.entities.TblProsaDemoErrores;
import com.example.DemoPosaBackend.service.TblProsaDemoCatErroresService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.example.DemoPosaBackend.Utilities.FormatDate.formatStandardDateStringToDate;

@Service
public class TblProsaDemoCatErorresServiceImpl implements TblProsaDemoCatErroresService {

    private TblProsaDemoCatErroresDao catErroresDao;
    private TblProsaDemoErroresDao erroresDao;

    public TblProsaDemoCatErorresServiceImpl(TblProsaDemoCatErroresDao catErroresDao,TblProsaDemoErroresDao erroesDao) {
        this.catErroresDao = catErroresDao;
        this.catErroresDao = catErroresDao;
    }

    @Override
    public List<TblProsaDemoCatErroresDto> getAll() {

        List<TblProsaDemoCatErrores> listCatErrores= catErroresDao.getAllCatErrores();
        List<TblProsaDemoCatErroresDto> listCatErroresDto= new ArrayList<>();
        listCatErrores.forEach(error -> {
            TblProsaDemoCatErroresDto dto = null;
            try {
                 dto = new TblProsaDemoCatErroresDto(error);
            } catch (ParseException e) {
                return;
            }
            listCatErroresDto.add(dto);
        });
        return listCatErroresDto;
    }

    @Override
    public TblProsaDemoCatErroresDto save(CatErroresRequestDto requestDto) throws ParseException {
        TblProsaDemoCatErrores entity = new TblProsaDemoCatErrores();
        TblProsaDemoErrores errorEntity = erroresDao.getById(requestDto.getIdCodigoError());
        entity.setFecha(formatStandardDateStringToDate(requestDto.getFecha()));
        entity.setCodigoError(errorEntity);
        entity.setDescripcion(requestDto.getDescripcion());
        entity.setMensajeError(requestDto.getMensajeError());
        entity.setSeveridad(requestDto.getSeveridad());
        entity.setGenerarEvento(requestDto.getGenerarEvento());
        entity.setFirmaRegistro(requestDto.getFirmaRegistro());
        catErroresDao.save(entity);
        return new TblProsaDemoCatErroresDto(entity);
    }
}
