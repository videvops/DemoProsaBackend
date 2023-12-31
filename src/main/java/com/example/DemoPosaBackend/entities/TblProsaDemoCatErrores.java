package com.example.DemoPosaBackend.entities;

import com.example.DemoPosaBackend.dto.TblProsaDemoCatErrores.TblProsaDemoCatErroresDto;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TBL_PROSADEMO_CAT_ERRORES")
public class TblProsaDemoCatErrores {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "FECHA",nullable = false)
    private Date fecha;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "CODIGO_ERROR", nullable = false)
    private TblProsaDemoErrores codigoError;
    @Column(name = "DESCRIPCION", nullable = true , length = 120)
    private String descripcion;
    @Column(name = "MENSAJE_ERROR", nullable = true , length = 512)
    private String mensajeError;
    @Column(name = "SEVERIDAD",nullable = false)
    private Integer severidad;
    @Column(name = "GENERAR_EVENTO",nullable = false)
    private Integer generarEvento;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TblProsaDemoErrores getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(TblProsaDemoErrores codigoError) {
        this.codigoError = codigoError;
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
