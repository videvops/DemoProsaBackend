package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoTipoParametro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoTiposParametrosDao extends JpaRepository <TblProsaDemoTipoParametro, Integer> {

    @Query("SELECT b FROM TblProsaDemoTipoParametro b")
    List<TblProsaDemoTipoParametro> getAllTipos();
}
