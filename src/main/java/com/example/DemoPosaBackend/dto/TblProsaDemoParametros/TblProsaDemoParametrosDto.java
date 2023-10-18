package com.example.DemoPosaBackend.dto.TblProsaDemoParametros;

import com.example.DemoPosaBackend.entities.TblProsaDemoParametros;

public class TblProsaDemoParametrosDto {
    private String id;
    private String usuario;
    private String fechaAlta;
    private String fechaCambio;
    private String tipoParametro;
    private String parametro;
    private String valor;
    private String descripcion;
    private String estado;
    private String datoSensitivo;
    private String firmaRegistro;

    public TblProsaDemoParametrosDto(TblProsaDemoParametros entity){
        this.id = Long.toString(entity.getId());
        this.usuario = entity.getUsuario().getNombre();
        this.fechaAlta = entity.getFechaAlta().toString();
        this.fechaCambio = entity.getFechaCambio() != null ?  entity.getFechaCambio().toString() : null ;
        this.tipoParametro = entity.getTipoParametro().getTipoParametro();
        this.parametro =entity.getParametro().getParametro();
        this.valor = entity.getValor();
        this.descripcion = entity.getDescripcion();
        this.estado = entity.getEstado().toString();
        this.datoSensitivo = entity.getDatoSensitivo().toString();
        this.firmaRegistro = entity.getFirmaRegistro();
    }
    public String getId(){return id;}

    public void setId(String id) {this.id = id;}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDatoSensitivo() {
        return datoSensitivo;
    }

    public void setDatoSensitivo(String datoSensitivo) {
        this.datoSensitivo = datoSensitivo;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
