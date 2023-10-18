package com.example.DemoPosaBackend.dto.TblProsaDemoCatTipoParametro;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatTipoParametro;

public class TblProsaDemoCatTipoParametroDto {
    private String tipoParametro;

    public TblProsaDemoCatTipoParametroDto(TblProsaDemoCatTipoParametro entity) {
        this.tipoParametro = entity.getTipoParametro();
    }
    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }
}
