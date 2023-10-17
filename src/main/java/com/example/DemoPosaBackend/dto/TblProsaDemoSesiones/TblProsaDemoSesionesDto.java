package com.example.DemoPosaBackend.dto.TblProsaDemoSesiones;

import com.example.DemoPosaBackend.entities.TblProsaDemoSesiones;
import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;

import java.sql.Date;

public class TblProsaDemoSesionesDto {

    private String id;
    private String fecha;
    private String usuario;
    private String ipAplicativo;
    private String ipSesion;
    private String idSesion;
    private String sesionInicio;
    private String sesionFin;
    private String estatusSesion;
    private String firmaRegistro;

    public TblProsaDemoSesionesDto(TblProsaDemoSesiones entity){
        this.id = Long.toString(entity.getId());
        this.fecha = entity.getFecha().toString();
        this.usuario = entity.getUsuario().getNombre();
        this.ipAplicativo = entity.getIpAplicativo();
        this.ipSesion = entity.getIpSesion();
        this.idSesion = entity.getIdSesion();
        this.sesionInicio = entity.getSesionInicio().toString();
        this.sesionFin = entity.getSesionFin().toString();
        this.estatusSesion = entity.getEstatusSesion();
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

    public String getIdSesion(){return idSesion;}

    public void setIdSesion(String idSesion) {this.idSesion = idSesion;}

    public String getSesionInicio() {return sesionInicio;}

    public void setSesionInicio(String sesionInicio) {this.sesionInicio = sesionInicio;}

    public String getSesionFin() {return sesionFin;}

    public void setSesionFin(String sesionFin) {this.sesionFin = sesionFin;}

    public String getEstatusSesion() {return estatusSesion;}

    public void setEstatusSesion(String estatusSesion) {this.estatusSesion = estatusSesion;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
