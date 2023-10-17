package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoErrores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoErroresDao extends JpaRepository<TblProsaDemoErrores, Integer> {

    @Query(value = "SELECT b FROM TblProsaDemoErrores b")
    List<TblProsaDemoErrores> getAllErrores();
}
