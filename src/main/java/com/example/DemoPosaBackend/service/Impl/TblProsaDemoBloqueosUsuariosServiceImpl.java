package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoBloqueosUsuariosDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoBloqueosUsuarios.TblProsaDemoBloqueosUsuariosDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoBloqueosUsuarios;
import com.example.DemoPosaBackend.service.TblProsaDemoBloqueosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoBloqueosUsuariosServiceImpl implements TblProsaDemoBloqueosUsuariosService {

    @Autowired
    private TblProsaDemoBloqueosUsuariosDao daoBloqueos;

    public TblProsaDemoBloqueosUsuariosServiceImpl(TblProsaDemoBloqueosUsuariosDao daoVersiones){
        this.daoBloqueos = daoBloqueos;
    }

    @Override
    public List<TblProsaDemoBloqueosUsuariosDto> getAll(){
        List<TblProsaDemoBloqueosUsuarios> bloqueosUsuariosListList = daoBloqueos.getAllBloqueos();
        List<TblProsaDemoBloqueosUsuariosDto> dtoResponse = new ArrayList<>();

        bloqueosUsuariosListList.forEach(bloqueosUsuarios ->{
            TblProsaDemoBloqueosUsuariosDto dto = new TblProsaDemoBloqueosUsuariosDto(bloqueosUsuarios);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }

}
