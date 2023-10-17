package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoTiposParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoTiposParametrosDao extends JpaRepository <TblProsaDemoTiposParametros, Integer> {

    @Query("SELECT b FROM TblProsaDemoTiposParametros b")
    List<TblProsaDemoTiposParametros> getAllTipos();
}
