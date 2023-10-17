package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoCatErrores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TblProsaDemoCatErroresDao extends JpaRepository<TblProsaDemoCatErrores, Integer> {

    @Query(value = "SELECT b FROM TblProsaDemoCatErrores b")
    List<TblProsaDemoCatErrores> getAllCatErrores();
}
