package com.example.DemoPosaBackend.entities;


import jakarta.persistence.*;

import java.beans.ConstructorProperties;

@Entity
@Table(name = "TBL_PROSADEMO_CAT_PARAMETROS")
public class TblProsaDemoCatParametros {

    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARAMETRO", nullable = false, length = 50)
    private String parametro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
}
