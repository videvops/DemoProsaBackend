package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TblProsaDemoUsuariosDao extends JpaRepository<TblProsaDemoUsuarios, Integer> {

    @Query("SELECT b FROM TblProsaDemoUsuarios b")
    List<TblProsaDemoUsuarios> getAllUsuarios();
}
