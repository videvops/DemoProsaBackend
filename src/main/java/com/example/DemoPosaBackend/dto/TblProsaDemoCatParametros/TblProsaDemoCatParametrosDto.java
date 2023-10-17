package com.example.DemoPosaBackend.dto.TblProsaDemoCatParametros;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatParametros;

public class TblProsaDemoCatParametrosDto {
    private String parametro;
    public TblProsaDemoCatParametrosDto(TblProsaDemoCatParametros entity) {
        this.parametro = entity.getParametro();
    }
    public String getParametro() {
        return parametro;
    }
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
}
