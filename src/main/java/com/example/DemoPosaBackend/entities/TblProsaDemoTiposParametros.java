package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PROSADEMO_TIPO_PARAMETRO")
public class TblProsaDemoTiposParametros {
    @Id
    @Column(name = "ID_PARAMETRO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TIPO_PARAMETRO", nullable = false)
    private String tipoParametro;

    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;

    @Column(name = "ROL_ASOCIADO", nullable = false)
    private String rolAsociado;

    public long getId(){return id;}

    public void setId(long id) {this.id = id;}

    public String getTipoParametro(){return tipoParametro;}

    public void setTipoParametro(String tipoParametro) {this.tipoParametro = tipoParametro; }

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getRolAsociado() {return rolAsociado;}

    public void setRolAsociado(String rolAsociado) {this.rolAsociado = rolAsociado;}
}
