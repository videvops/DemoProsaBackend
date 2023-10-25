package com.example.DemoPosaBackend.dto.TblProsaDemoUsuarios;

// Este es el DTO que se va a utilizar para crear un usuario
// DTO = Data Transfer Object, es un objeto que se utiliza para transferir datos entre procesos

import java.util.List;          // Sirve para crear listas

public class RequestDto {
    // Atributos
    // Estos atributos son los que se van a utilizar para crear un usuario
    // Se utiliza el mismo nombre que en la base de datos
    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

}
