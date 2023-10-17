package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TblProsaDemoCatParametrosDao extends JpaRepository<TblProsaDemoCatParametros, Integer> {

    @Query("Select b From TblProsaDemoCatParametros b")
    public List<TblProsaDemoCatParametros> getAllCatParametros();
}
