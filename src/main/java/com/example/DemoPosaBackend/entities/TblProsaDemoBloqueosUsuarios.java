package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TBL_PROSADEMO_BLOQUEOS_USUARIOS")
public class TblProsaDemoBloqueosUsuarios {
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

    @Column(name = "ID_BLOQUEO", nullable = false)
    private String idBloqueo;

    @Column(name = "BLOQUEO_INICIO", nullable = false)
    private Date bloqueoInicio;

    @Column(name = "CODIGO_BLOQUEO", nullable = false)
    private String codigoBloqueo;

    @Column(name = "ORIGEN_BLOQUEO", nullable = false)
    private String origenBloqueo;

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

    public String getIdBloqueo(){return idBloqueo;}

    public void setIdSesion(String idBloqueo) {this.idBloqueo = idBloqueo;}

    public Date getBloqueoInicio() {return bloqueoInicio;}

    public void setSesionInicio(Date bloqueoInicio) {this.bloqueoInicio = bloqueoInicio;}

    public String getCodigoBloqueo() {return codigoBloqueo;}

    public void setCodigoBloqueo(String codigoBloqueo) {this.codigoBloqueo = codigoBloqueo;}

    public String getOrigenBloqueo() {return origenBloqueo;}

    public void setOrigenBloqueon(String origenBloqueo) {this.origenBloqueo = origenBloqueo;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
