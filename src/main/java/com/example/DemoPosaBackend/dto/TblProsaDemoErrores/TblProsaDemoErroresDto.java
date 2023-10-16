package com.example.DemoPosaBackend.dto.TblProsaDemoErrores;

import com.example.DemoPosaBackend.entities.TblProsaDemoErrores;

public class TblProsaDemoErroresDto {

    private String fecha;
    private String codigoError;
    private String usuario;
    private String firmaRegistro;


    public TblProsaDemoErroresDto(TblProsaDemoErrores entity) {
        this.fecha = entity.getFecha() != null ?  entity.getFecha().toString() :  null ;
        this.codigoError = entity.getCodigoError();
        this.usuario = entity.getUsuario().getNombre();
        this.firmaRegistro = entity.getFirmaRegistro();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
