package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoSesiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoSesionesDao extends JpaRepository<TblProsaDemoSesiones, Integer> {

    @Query("SELECT b FROM TblProsaDemoSesiones b")
    List<TblProsaDemoSesiones> getAllSesiones();
}
