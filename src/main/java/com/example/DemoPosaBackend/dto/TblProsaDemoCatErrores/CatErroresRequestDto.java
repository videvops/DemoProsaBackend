package com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores;

public class CatErroresRequestDto {

    private Integer id;
    private String fecha;
    private String codigoError;
    private Integer idCodigoError;
    private String descripcion;
    private String mensajeError;
    private Integer severidad;
    private Integer generarEvento;
    private String firmaRegistro;

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

    public Integer getIdCodigoError() {
        return idCodigoError;
    }

    public void setIdCodigoError(Integer idCodigoError) {
        this.idCodigoError = idCodigoError;
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
