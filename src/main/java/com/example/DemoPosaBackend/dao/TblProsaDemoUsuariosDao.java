package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
// Este archivo se encarga de hacer las consultas a la base de datos
public interface TblProsaDemoUsuariosDao extends JpaRepository<TblProsaDemoUsuarios, Integer> {

    // Consulta para obtener todos los usuarios
    @Query("SELECT b FROM TblProsaDemoUsuarios b")
    List<TblProsaDemoUsuarios> getAllUsuarios();
}
