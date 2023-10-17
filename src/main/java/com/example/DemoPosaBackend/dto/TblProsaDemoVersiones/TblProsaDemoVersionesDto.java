package com.example.DemoPosaBackend.dto.TblProsaDemoVersiones;

import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;

public class TblProsaDemoVersionesDto {
    private String id;
    private String fecha;
    private String version;
    private String aplicativo;
    private String compilado;
    private String estado;
    private String firmaRegistro;

    public TblProsaDemoVersionesDto(TblProsaDemoVersiones entity){
        this.id = Long.toString(entity.getId());
        this.fecha = entity.getFecha().toString();
        this.version = entity.getVersion();
        this.aplicativo = entity.getAplicativo();
        this.compilado = entity.getCompilado();
        this.estado = entity.getEstado();
        this.firmaRegistro = entity.getFirmaRegistro();
    }


    public String getId(){return id;}

    public void setId(String id) {this.id = id;}
    public String getFecha(){return fecha;}

    public void setFecha(String fecha){this.fecha = fecha;}

    public String getAplicativo(){return aplicativo;}

    public void setAplicativo(String aplicativo){this.aplicativo = aplicativo;}

    public String getVersion(){return version;}

    public void setversion(String version){this.version = version;}

    public String getCompilado(){return compilado;}

    public void setCompilado(String compilado){this.compilado = compilado;}

    public void setEstado(String estado){this.estado = estado;}

    public String getEstado(){return estado;}

    public String getFirmaRegistro() {return firmaRegistro;}

    public void setFirmaRegistro(String firmaRegistro) {this.firmaRegistro = firmaRegistro;}

}
