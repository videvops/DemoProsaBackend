package com.example.DemoPosaBackend.entities;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_SESIONES")
public class TblProsaDemoSesiones {
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

    @Column(name = "ID_SESION", nullable = false)
    private String idSesion;

    @Column(name = "SESION_INICIO", nullable = false)
    private Date sesionInicio;

    @Column(name = "SESION_FIN", nullable = false)
    private Date sesionFin;

    @Column(name = "ESTATUS_SESION", nullable = false)
    private String estatusSesion;

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

    public String getIdSesion(){return idSesion;}

    public void setIdSesion(String idSesion) {this.idSesion = idSesion;}

    public Date getSesionInicio() {return sesionInicio;}

    public void setSesionInicio(Date sesionInicio) {this.sesionInicio = sesionInicio;}

    public Date getSesionFin() {return sesionFin;}

    public void setSesionFin(Date sesionFin) {this.sesionFin = sesionFin;}

    public String getEstatusSesion() {return estatusSesion;}

    public void setEstatusSesion(String estatusSesion) {this.estatusSesion = estatusSesion;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
