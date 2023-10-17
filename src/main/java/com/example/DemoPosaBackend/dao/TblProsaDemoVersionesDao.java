package com.example.DemoPosaBackend.dao;

import com.example.DemoPosaBackend.entities.TblProsaDemoVersiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TblProsaDemoVersionesDao extends JpaRepository <TblProsaDemoVersiones, Integer> {

    @Query("SELECT b FROM TblProsaDemoVersiones b")
    List<TblProsaDemoVersiones> getAllVersiones();
}
