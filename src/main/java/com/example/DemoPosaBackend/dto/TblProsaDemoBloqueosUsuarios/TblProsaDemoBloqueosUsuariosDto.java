package com.example.DemoPosaBackend.dto.TblProsaDemoBloqueosUsuarios;

import com.example.DemoPosaBackend.entities.TblProsaDemoBloqueosUsuarios;

import java.sql.Date;

public class TblProsaDemoBloqueosUsuariosDto {
    private String id;
    private String fecha;
    private String usuario;
    private String ipAplicativo;
    private String ipSesion;
    private String idBloqueo;
    private String bloqueoInicio;
    private String codigoBloqueo;
    private String origenBloqueo;
    private String firmaRegistro;

    public TblProsaDemoBloqueosUsuariosDto(TblProsaDemoBloqueosUsuarios entity){
        this.id = Long.toString(entity.getId());
        this.fecha = entity.getFecha().toString();
        this.usuario = entity.getUsuario().getNombre();
        this.ipAplicativo = entity.getIpAplicativo();
        this.ipSesion = entity.getIpSesion();
        this.idBloqueo = entity.getIdBloqueo();
        this.bloqueoInicio = entity.getBloqueoInicio().toString();
        this.codigoBloqueo = entity.getCodigoBloqueo();
        this.origenBloqueo = entity.getOrigenBloqueo();
        this.firmaRegistro = entity.getFirmaRegistro();
    }

    public String getId(){return id;}

    public void setId(String id){this.id= id;}

    public String getFecha(){return fecha;}

    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIpAplicativo() {return ipAplicativo;}

    public void setIpAplicativo(String ipAplicativo) {this.ipAplicativo = ipAplicativo;}

    public String getIpSesion() {return ipSesion;}

    public void setIpSesion(String ipSesion) {this.ipSesion = ipSesion;}

    public String getIdBloqueo(){return idBloqueo;}

    public void setIdSesion(String idBloqueo) {this.idBloqueo = idBloqueo;}

    public String getBloqueoInicio() {return bloqueoInicio;}

    public void setSesionInicio(String bloqueoInicio) {this.bloqueoInicio = bloqueoInicio;}

    public String getCodigoBloqueo() {return codigoBloqueo;}

    public void setCodigoBloqueo(String codigoBloqueo) {this.codigoBloqueo = codigoBloqueo;}

    public String getOrigenBloqueo() {return origenBloqueo;}

    public void setOrigenBloqueon(String origenBloqueo) {this.origenBloqueo = origenBloqueo;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
