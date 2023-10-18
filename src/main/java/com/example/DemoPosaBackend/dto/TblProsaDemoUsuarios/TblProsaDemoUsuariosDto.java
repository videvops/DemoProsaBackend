package com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios;

import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;

public class TblProsaDemoUsuariosDto {

    private String id;
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;

    public TblProsaDemoUsuariosDto(TblProsaDemoUsuarios entity){
        this.id = Long.toString(entity.getId());
        this.nombre = entity.getNombre();
        this.ApellidoPaterno = entity.getApellidoPaterno();
        this.ApellidoMaterno = entity.getApellidoMaterno();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }
}
