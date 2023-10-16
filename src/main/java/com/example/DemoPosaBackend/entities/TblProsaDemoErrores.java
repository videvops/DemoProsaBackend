package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_ERRORES")
public class TblProsaDemoErrores {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FECHA",nullable = false)
    private Date fecha;
    @Column(name= "CODIGO_ERROR", nullable = false, length = 5)
    private String codigoError;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "USUARIO", nullable = false)
    private TblProsaDemoUsuarios usuario;
    @Column(name = "FIRMA_REGISTRO", nullable = false, length = 512)
    private String firmaRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public TblProsaDemoUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(TblProsaDemoUsuarios usuario) {
        this.usuario = usuario;
    }

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }
}
