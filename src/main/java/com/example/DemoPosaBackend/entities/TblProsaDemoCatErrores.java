package com.example.DemoPosaBackend.entities;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PROSADEMO_CAT_ERRORES")
public class TblProsaDemoCatErrores {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "FECHA",nullable = false)
    private String fecha;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "CODIGO_ERROR", nullable = false)
    private TblProsaDemoErrores codigoError;
    @Column(name = "DESCRIPCION", nullable = true , length = 120)
    private String descripcion;
    @Column(name = "MENSAJE_ERROR", nullable = true , length = 512)
    private String mensajeError;
    @Column(name = "SEVERIDAD",nullable = false)
    private String severidad;
    @Column(name = "GENERAR_EVENTO",nullable = false)
    private String generarEvento;
    @Column(name = "FIRMA_REGISTRO", nullable = false, length = 512)
    private String firmaRegistro;

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId() {
        return Long.parseLong(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TblProsaDemoErrores getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(TblProsaDemoErrores codigoError) {
        this.codigoError = codigoError;
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
