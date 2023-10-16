package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_VERSIONES")
public class TblProsaDemoVersiones {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FECHA", nullable = false)
    private Date fecha;

    @Column(name = "APLICATIVO", nullable = false)
    private String aplicativo;

    @Column(name = "VERSION", nullable = false)
    private String version;

    @Column(name = "COMPILADO", nullable = false)
    private String compilado;

    @Column(name = "ESTADO", nullable = false)
    private String estado;

    @Column(name = "FIRMA_REGISTRO", nullable = false)
    private String firmaRegistro;

    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public Date getFecha(){return fecha;}

    public void setFecha(Date fecha){this.fecha = fecha;}

    public String getAplicativo(){return aplicativo;}

    public void setAplicativo(String aplicativo){this.aplicativo = aplicativo;}

    public String getVersion(){return version;}

    public void setversion(String version){this.version = version;}

    public String getCompilado(){return compilado;}

    public void setCompilado(String compilado){this.compilado = compilado;}

    public String setEstado(){return estado;}

    public void getEstado(String estado){this.estado = estado;}

    public String getFirmaRegistro() {
        return firmaRegistro;
    }

    public void setFirmaRegistro(String firmaRegistro) {
        this.firmaRegistro = firmaRegistro;
    }

}
