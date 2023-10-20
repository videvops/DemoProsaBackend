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
    private String codigoError;
    @Column(name = "DESCRIPCION", nullable = true , length = 120)
    private String descripcion;
    @Column(name = "MENSAJE_ERROR", nullable = true , length = 512)
    private String mensajeError;
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name= "USUARIO", nullable = false)
//    private TblProsaDemoUsuarios usuario;
    @Column(name = "SEVERIDAD",nullable = false)
    private String severidad;
    @Column(name = "GENERAR_EVENTO",nullable = false)
    private String generarEvento;
    @Column(name = "FIRMA_REGISTRO", nullable = false, length = 512)
    private String firmaRegistro;

    public TblProsaDemoCatErrores() {
    }

    public TblProsaDemoCatErrores(TblProsaDemoCatErroresDto dto) {
        // Constructor que recibe un DTO y lo convierte a una entidad
        this.id = dto.getId();
        this.fecha = dto.getFecha();
        this.codigoError = dto.getCodigoError();
        this.descripcion = dto.getDescripcion();
        this.mensajeError = dto.getMensajeError();
        this.severidad = dto.getSeveridad();
        this.generarEvento = dto.getGenerarEvento();
        this.firmaRegistro = dto.getFirmaRegistro();
    }

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

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
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
