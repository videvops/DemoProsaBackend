package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoParametrosDao extends JpaRepository <TblProsaDemoParametros, Integer> {

    @Query("SELECT b FROM TblProsaDemoParametros b")
    List<TblProsaDemoParametros> getAllParametros();
}
