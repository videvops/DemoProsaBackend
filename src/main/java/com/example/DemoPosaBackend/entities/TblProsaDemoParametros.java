package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_PARAMETROS")
public class TblProsaDemoParametros {

    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "USUARIO", nullable = false)
    private TblProsaDemoUsuarios usuario;
    @Column(name = "FECHA_ALTA", nullable = false)
    private Date fechaAlta;
    @Column(name = "FECHA_CAMBIO", nullable = false)
    private Date fechaCambio;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "TIPO_PARAMETRO", nullable = false)
    private TblProsaDemoCatTipoParametro tipoParametro;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "PARAMETRO", nullable = false)
    private TblProsaDemoCatParametros parametro;
    @Column(name = "VALOR", nullable = false, length = 512)
    private String valor;
    @Column(name = "DESCRIPCION", nullable = false, length = 512)
    private String descripcion;
    @Column(name = "DATO_SENSITIVO", nullable = false)
    private Integer datoSensitivo;
    @Column(name = "ESTADO", nullable = false)
    private Integer estado;
    @Column(name = "FIRMA_REGISTRO", nullable = false, length = 512)
    private String firmaRegistro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TblProsaDemoUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(TblProsaDemoUsuarios usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public TblProsaDemoCatTipoParametro getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(TblProsaDemoCatTipoParametro tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public TblProsaDemoCatParametros getParametro() {
        return parametro;
    }

    public void setParametro(TblProsaDemoCatParametros parametro) {
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

    public Integer getDatoSensitivo() {
        return datoSensitivo;
    }

    public void setDatoSensitivo(Integer datoSensitivo) {
        this.datoSensitivo = datoSensitivo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
