// Este archivo sirve para implementar los metodos de la interfaz TblProsaDemoUsuariosService
package com.example.DemoPosaBackend.service.Impl;

import com.example.DemoPosaBackend.dao.TblProsaDemoUsuariosDao;
import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.RequestDto;
import com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios.TblProsaDemoUsuariosDto;
import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;
import com.example.DemoPosaBackend.service.TblProsaDemoUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TblProsaDemoUsuariosServiceImpl implements TblProsaDemoUsuariosService {

    @Autowired
    private TblProsaDemoUsuariosDao daoUsuarios;

    public TblProsaDemoUsuariosServiceImpl(TblProsaDemoUsuariosDao daoUsuarios){
        this.daoUsuarios = daoUsuarios;
    }

    @Override
    public List<TblProsaDemoUsuariosDto> getAll(){
        List<TblProsaDemoUsuarios> usuariosList = daoUsuarios.getAllUsuarios();
        List<TblProsaDemoUsuariosDto> dtoResponse = new ArrayList<>();

        usuariosList.forEach(usuario ->{
            TblProsaDemoUsuariosDto dto = new TblProsaDemoUsuariosDto(usuario);
            dtoResponse.add(dto);
        });
        return dtoResponse;
    }

    @Override
    public TblProsaDemoUsuariosDto createUsuario(RequestDto dto) {
        return null;
    }
}
