package com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;

import java.text.ParseException;

import static com.example.DemoPosaBackend.Utilities.FormatDate.formatStandardDateToString;

public class TblProsaDemoCatErroresDto {
    private Integer id;
    private String fecha;
    private String codigoError;
    private String descripcion;
    private String mensajeError;
    private Integer severidad;
    private Integer generarEvento;
    private String firmaRegistro;

    public TblProsaDemoCatErroresDto(TblProsaDemoCatErrores entity ) throws ParseException {
        this.id = entity.getId();
        this.fecha = entity.getFecha() != null ? formatStandardDateToString(entity.getFecha()):  null ;
        this.codigoError = entity.getCodigoError().toString();
        this.descripcion = entity.getDescripcion();
        this.mensajeError = entity.getMensajeError();
        this.severidad = entity.getSeveridad();
        this.generarEvento = entity.getGenerarEvento();
        this.firmaRegistro = entity.getFirmaRegistro();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSeveridad() {
        return severidad;
    }

    public void setSeveridad(Integer severidad) {
        this.severidad = severidad;
    }

    public Integer getGenerarEvento() {
        return generarEvento;
    }

    public void setGenerarEvento(Integer generarEvento) {
        this.generarEvento = generarEvento;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
