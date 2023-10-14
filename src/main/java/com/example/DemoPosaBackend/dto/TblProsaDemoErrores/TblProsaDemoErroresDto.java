package com.example.DemoPosaBackend.dto.TblProsaDemoErrores;

import com.example.DemoPosaBackend.entities.TblProsaDemoParametros;

public class TblProsaDemoErroresDto {
    // --> Variables
    private String id;
    private String dateAlta;
    private String codigo;
    private String descripcion;
    private String mensaje;
    private String severidad;
    private String evento;

    // --> Funciones
    public TblProsaDemoErroresDto(TblProsaDemoParametros entity){

    }
}
