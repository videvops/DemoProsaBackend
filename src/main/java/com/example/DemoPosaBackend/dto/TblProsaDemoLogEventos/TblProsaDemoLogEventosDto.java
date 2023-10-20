package com.example.DemoPosaBackend.dto.TblProsaDemoLogEventos;

import com.example.DemoPosaBackend.entities.TblProsaDemoLogEventos;
import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;
import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;

import java.sql.Date;

public class TblProsaDemoLogEventosDto {

    private String id;
    private String fecha;
    private String usuario;
    private String ipAplicativo;
    private String ipSesion;
    private String evento;
    private String parametros;
    private String firmaRegistro;
    public TblProsaDemoLogEventosDto(TblProsaDemoLogEventos entity){
        this.id = Long.toString(entity.getId());
        this.fecha = entity.getFecha().toString();
        this.usuario = entity.getUsuario().getNombre();
        this.ipAplicativo = entity.getIpAplicativo();
        this.ipSesion = entity.getIpSesion();
        this.evento = entity.getEvento();
        this.parametros = entity.getParametros();
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

    public String getEvento() {return evento;}

    public void setEvento(String evento) {this.evento = evento;}

    public String getParametros() {return parametros;}

    public void setParametros(String parametros) {this.parametros = parametros;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}
}
