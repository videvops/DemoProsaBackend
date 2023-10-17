package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoLogEventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TblProsaDemoLogEventosDao extends JpaRepository<TblProsaDemoLogEventos, Integer> {

    @Query("SELECT b FROM TblProsaDemoLogEventos b")
    List<TblProsaDemoLogEventos> getAllLogEventos();
}
