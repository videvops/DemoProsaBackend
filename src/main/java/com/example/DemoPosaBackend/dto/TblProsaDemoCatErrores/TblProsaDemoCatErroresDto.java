package com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;

public class TblProsaDemoCatErroresDto {
    private String fecha;
    private String codigoError;
    private String descripcion;
    private String mensajeError;
    private String severidad;
    private String generarEvento;
    private String firmaRegistro;

    public TblProsaDemoCatErroresDto(TblProsaDemoCatErrores entity ) {
        this.fecha = entity.getFecha() != null ?  entity.getFecha().toString() :  null ;
        this.codigoError = entity.getCodigoError().getCodigoError();
        this.descripcion = entity.getDescripcion();
        this.mensajeError = entity.getMensajeError();
        this.severidad = entity.getSeveridad().toString();
        this.generarEvento = entity.getGenerarEvento().toString();
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getGenerarEvento() {
        return generarEvento;
    }

    public void setGenerarEvento(String generarEvento) {
        this.generarEvento = generarEvento;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
