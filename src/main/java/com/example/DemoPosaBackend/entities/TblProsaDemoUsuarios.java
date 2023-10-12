package com.example.DemoPosaBackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PROSADEMO_USUARIOS")
public class TblProsaDemoUsuarios {

    @Id
    @Column(name = "NUMERO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE", nullable = false , length = 12)
    private String nombre;

    @Column(name = "APELLIDO_PATERNO", nullable =   false, length = 12)
    private String ApellidoPaterno;

    @Column(name = "APELLIDO_MATERNO", length = 12)
    private String ApellidoMaterno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
