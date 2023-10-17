package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "TBL_PROSADEMO_CAT_TIPO_PARAMETROS")
public class TblProsaDemoCatTipoParametro {
    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "TIPO_PARAMETRO", nullable = false)
    private String tipoParametro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }
}
