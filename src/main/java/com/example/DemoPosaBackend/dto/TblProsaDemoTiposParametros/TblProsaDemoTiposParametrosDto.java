package com.example.DemoPosaBackend.dto.TblProsaDemoTiposParametros;

import com.example.DemoPosaBackend.entities.TblProsaDemoTipoParametro;

public class TblProsaDemoTiposParametrosDto {

    private String id;
    private String tipoParametro;
    private String descripcion;
    private String rolAsociado;

    public TblProsaDemoTiposParametrosDto(TblProsaDemoTipoParametro entity){
        this.id = Long.toString(entity.getId());
        this.tipoParametro = entity.getTipoParametro();
        this.descripcion = entity.getDescripcion();
        this.rolAsociado = entity.getRolAsociado();
    }
    public String getId(){return id;}

    public void setId(String id) {this.id = id;}

    public String getTipoParametro(){return tipoParametro;}

    public void setTipoParametro(String tipoParametro) {this.tipoParametro = tipoParametro; }

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getRolAsociado() {return rolAsociado;}

    public void setRolAsociado(String rolAsociado) {this.rolAsociado = rolAsociado;}
}
