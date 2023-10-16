package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_LOG_EVENTOS")
public class TblProsaDemoLogEventos {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FECHA", nullable = false)
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "USUARIO", nullable = false)
    private TblProsaDemoUsuarios usuario;

    @Column(name = "IP_APLICATIVO", nullable = false)
    private String ipAplicativo;

    @Column(name = "IP_SESION", nullable = false)
    private String ipSesion;

    @Column(name = "EVENTO", nullable = false)
    private String evento;

    @Column(name = "PARAMETROS", nullable = false)
    private String parametros;

    @Column(name = "FIRMA_REGISTRO", nullable = false, length = 512)
    private String firmaRegistro;

    public long getId(){return id;}

    public void setId(long id){this.id= id;}

    public Date getFecha(){return fecha;}

    public void setFecha(Date fecha) {this.fecha = fecha;}

    public TblProsaDemoUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(TblProsaDemoUsuarios usuario) {
        this.usuario = usuario;
    }

    public String getIpAplicativo() {return ipAplicativo;}

    public void setIpAplicativo(String ipAplicativo) {this.ipAplicativo = ipAplicativo;}

    public String getIpSesion() {return ipSesion;}

    public void setIpSesion(String ipSesion) {this.ipSesion = ipSesion;}

    public String getEvento() {return evento;}

    public void setEvento(String evento) {this.evento = evento;}

    public String getParametros() {return parametros;}

    public void setParametros(String parametros) {this.parametros = parametros;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
