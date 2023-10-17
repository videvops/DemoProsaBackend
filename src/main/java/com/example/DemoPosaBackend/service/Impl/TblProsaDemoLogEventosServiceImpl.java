package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoLogEventosDao;
import com.example.DemoPosaBackend.dao.TblProsaDemoVersionesDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoLogEventos.TblProsaDemoLogEventosDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoVersiones.TblProsaDemoVersionesDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoLogEventos;
import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;
import com.example.DemoPosaBackend.service.TblProsaDemoLogEventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoLogEventosServiceImpl implements TblProsaDemoLogEventosService {
    @Autowired
    private TblProsaDemoLogEventosDao daoLogEventos;

    public TblProsaDemoLogEventosServiceImpl(TblProsaDemoLogEventosDao daoLogEventos){
        this.daoLogEventos = daoLogEventos;
    }

    @Override
    public List<TblProsaDemoLogEventosDto> getAll(){
        List<TblProsaDemoLogEventos> logEventosList = daoLogEventos.getAllLogEventos();
        List<TblProsaDemoLogEventosDto> dtoResponse = new ArrayList<>();

        logEventosList.forEach(evento ->{
            TblProsaDemoLogEventosDto dto = new TblProsaDemoLogEventosDto(evento);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }}
